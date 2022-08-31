package editLeadPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import parentClass.ProjectSpecificationMethod;

public class UpdatedViewLeadPage extends ProjectSpecificationMethod{

		public UpdatedViewLeadPage(ChromeDriver driver, ExtentTest node) {
		
			this.driver = driver;
			this.node = node;
			
		}
	
		public UpdatedViewLeadPage verifyLead(String Company, String expected) throws InterruptedException, IOException {
		
			try {
			
			Thread.sleep(2000);
			String actual = driver.findElement(By.xpath("//td/span[@id='viewLead_companyName_sp']")).getText();
			Assert.assertEquals(Company, expected);
			System.out.println("Company Name Updated: " +actual);
			reportStep("Company Name is edited successfully " +expected, "pass");
	
			}
			
			catch (Exception e) {
			
				reportStep("Company Name is not edited " +e, "fail");
			}
			
			return this;
	}
	
}
