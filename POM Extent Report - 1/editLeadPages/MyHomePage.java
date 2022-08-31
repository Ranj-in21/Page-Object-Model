package editLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import parentClass.ProjectSpecificationMethod;


public class MyHomePage extends ProjectSpecificationMethod {
	
		public MyHomePage(ChromeDriver driver, ExtentTest node) {
		
			this.driver = driver;
			this.node = node;
		}
	
		public MyLeadsPage clickLeads() {
		
			driver.findElement(By.linkText("Leads")).click();
		
			//System.out.println(driver);
		
			return new MyLeadsPage(driver,node);
		

	}

}
