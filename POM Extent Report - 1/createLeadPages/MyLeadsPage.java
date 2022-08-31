
package createLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import parentClass.ProjectSpecificationMethod;


public class MyLeadsPage extends ProjectSpecificationMethod {
	
		public MyLeadsPage(ChromeDriver driver, ExtentTest node) {
		
			this.driver = driver;
			this.node = node;
		}
	
		public CreateLeadPage clickCreateLead() {
		
			driver.findElement(By.linkText("Create Lead")).click();
			return new CreateLeadPage(driver,node);
	
		}

}
