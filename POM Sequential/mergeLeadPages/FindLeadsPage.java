package mergeLeadPages;


import org.openqa.selenium.By;

import org.testng.Assert;

import baseClass.ProjectSpecificationMethod;


public class FindLeadsPage extends ProjectSpecificationMethod{
		
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
		
		public FindLeadsPage verifyLead() throws InterruptedException{
			
			Thread.sleep(2000);
			String actual = driver.findElement(By.className("x-paging-info")).getText();
			System.out.println(actual);
			String expected = "No records to display";
			Assert.assertEquals(actual, expected);
			return this;
			
		}
}
