package mergeLeadPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import parentClass.ProjectSpecificationMethod;


public class FindLeadsPage extends ProjectSpecificationMethod{
	
	public FindLeadsPage(ChromeDriver driver, ExtentTest node) {
		
		this.driver = driver;
		this.node = node;
	}
			
		public FindLeadsPage enterLead() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div/input[@name='id']")).sendKeys(id);
			
			return this;
		}	

		public FindLeadsPage clickFindLeadsButton() {
		
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			//System.out.println(driver);
			return this;
		}
		
		public FindLeadsPage verifyLead() throws InterruptedException, IOException {
			
			try {
			Thread.sleep(2000);
			String actual = driver.findElement(By.className("x-paging-info")).getText();
			System.out.println(actual);
			String expected = "No records to display";
			Assert.assertEquals(actual, expected);
			reportStep("The leads are successfully merged", "pass");
			}
			catch (Exception e) {
				reportStep("The leads are failed to merge " +e, "fail");
			}
			return this;
			
		}
}
