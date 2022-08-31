package createLeadPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import parentClass.ProjectSpecificationMethod;

public class ViewLeadPage extends ProjectSpecificationMethod {
	
		public ViewLeadPage(ChromeDriver driver, ExtentTest node) {
		
			this.driver = driver;
			this.node = node;
		}
	
		public ViewLeadPage verifyLead(String expected) throws IOException {
			
			try {
				
				String actual= driver.findElement(By.id("viewLead_firstName_sp")).getText();
				System.out.println(actual);
				Assert.assertEquals(actual, expected);
				reportStep(expected+" Create Lead is successfully created", "pass");
				
			}
			catch (Exception e) {
				
				reportStep("Create Lead is not created "+e, "fail" );
			}
		
			return this;
		 	
	}

}
