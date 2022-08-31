package createLeadPages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificationMethod;

public class CreateLeadPage extends ProjectSpecificationMethod {
	
	public CreateLeadPage companyName(String Company) {
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Company);
	
		return this;
		
	}
	
	public CreateLeadPage firstName(String FirstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
		
		return this;

	}
	public CreateLeadPage lastName(String LastName) {

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
		return this;
	}
		
	public CreateLeadPage phoneNumber(String PhoneNumber) {
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(PhoneNumber);
		return this;
	}
	
	public ViewLeadPage clickCreateLeadButton() {
		
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage();

	}

}
