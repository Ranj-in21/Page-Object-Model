package deleteLeadPages;

import org.openqa.selenium.By;


import baseClass.ProjectSpecificationMethod;


public class FindLeadsPage extends ProjectSpecificationMethod{

	
		public FindLeadsPage clickPhone() {
		
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
	
			return this;
	
		}

		public FindLeadsPage enterPhoneNumber(String Number) {
	
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(Number);
			return this;

		}

		public ViewLeadPage clickFindLeadsButton() {
	
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	
			return new ViewLeadPage();

		}

	
	
	
}
