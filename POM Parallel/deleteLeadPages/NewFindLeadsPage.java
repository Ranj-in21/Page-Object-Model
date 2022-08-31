package deleteLeadPages;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.ProjectSpecificationMethod;

public class NewFindLeadsPage extends ProjectSpecificationMethod {
	
		public NewFindLeadsPage(ChromeDriver driver) {
			
			this.driver = driver;
		}
	
		public NewFindLeadsPage enterLeadID() {
			
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys(LeadID);
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			return this;
			
		}
		
		public NewFindLeadsPage verifyDeleteLead() throws InterruptedException {
			
			Thread.sleep(2000);	
			String actual = driver.findElement(By.className("x-paging-info")).getText();
			String expected = "No records to display";
			System.out.println(actual);
			Assert.assertEquals(actual, expected);
			return this;

			
			
			
	}

		

}
