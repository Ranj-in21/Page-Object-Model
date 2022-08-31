package deleteLeadPages;


import org.openqa.selenium.By;

import org.testng.Assert;

import baseClass.ProjectSpecificationMethod;

public class NewFindLeadsPage extends ProjectSpecificationMethod {
	
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
