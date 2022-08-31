package deleteLeadPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import parentClass.ProjectSpecificationMethod;

public class NewFindLeadsPage extends ProjectSpecificationMethod {
	
		public NewFindLeadsPage(ChromeDriver driver, ExtentTest node) {
			
			this.driver = driver;
			this.node = node;
		}
	
		public NewFindLeadsPage enterLeadID() {
			
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys(LeadID);
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			return this;
			
		}
		
		public NewFindLeadsPage verifyDeleteLead() throws IOException {
			
			try {
			Thread.sleep(2000);	
			String actual = driver.findElement(By.className("x-paging-info")).getText();
			String expected = "No records to display";
			System.out.println(actual);
			Assert.assertEquals(actual, expected);
			reportStep("The Lead is deleted ", "pass");
			}
			catch (Exception e) {
				
				reportStep("The Lead is not deleted " +e, "fail");
				
			}
			return this;

			
			
			
	}

		

}
