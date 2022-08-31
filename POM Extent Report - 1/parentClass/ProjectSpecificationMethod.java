package parentClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ExcelData;


public class ProjectSpecificationMethod {
	
		public ChromeDriver driver;
		public String excelFile;
		public static ExtentReports extent;
		public ExtentTest test, node;
		public String testName, testDescription, testCategory, testAuthor;
		public static String LeadID, id;
		@BeforeSuite
		public void startReport() {
			
			ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Report/result.html");
			reporter.setAppendExisting(true);
			extent=new ExtentReports();
			extent.attachReporter(reporter);
			
		}
		
		@BeforeClass
		public void setTestCaseDetail() {
			
			test = extent.createTest(testName, testDescription);
			test.assignCategory(testCategory);
			test.assignAuthor(testAuthor);	
			
		}
		public int takeSnapShot() throws IOException {
			
			int randomNum=(int)(Math.random()*999999+10000000);
			File source = driver.getScreenshotAs(OutputType.FILE);
			File destination = new File("./snaps/img"+randomNum+".png");
			FileUtils.copyFile(source, destination);
			return randomNum;

		}
		
		public void reportStep(String stepDescription, String Status) throws IOException {
			
			if(Status.equalsIgnoreCase("pass")) {
				node.pass(stepDescription, MediaEntityBuilder.createScreenCaptureFromPath(".././Snaps/img"+takeSnapShot()+".png").build());
				
			}else if(Status.equalsIgnoreCase("fail")) {
				node.fail(stepDescription, MediaEntityBuilder.createScreenCaptureFromPath(".././Snaps/img"+takeSnapShot()+".png").build());		
				throw new RuntimeException("Please look into report for failure details");	
				
			}
		}
		
		@DataProvider(name = "TestData")
		
		public String[][] fetchData() throws IOException {
			String[][] readData = ExcelData.readData(excelFile);
			return readData;
		}
	
		@BeforeMethod
		public void preCondition() {
		
			node = test.createNode(testName);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		}
	
		@AfterMethod
		public void postCondition() {
		
			driver.close();

		}

		@AfterSuite
		public void stopReport() {
			
			extent.flush();
		}
		
	
	

}
