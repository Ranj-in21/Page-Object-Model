package baseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ExcelReadDataSeq;


public class ProjectSpecificationMethod {
	
	public static ChromeDriver driver;
	public static String LeadID, id;
	
	public String excelFile;
	
	@DataProvider(name = "TestData")
	public String[][] fetchData() throws IOException {
		
		String[][] readData = ExcelReadDataSeq.readData(excelFile);
		return readData;
		
	}
	
	@BeforeMethod
	public void preCondition() {
		
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

}
