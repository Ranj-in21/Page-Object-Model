package createLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificationMethod;

public class CreateLeadPage extends ProjectSpecificationMethod {
	
public CreateLeadPage(ChromeDriver driver) {
		
		this.driver = driver;
	}

	
	public CreateLeadPage companyName(String Company) {
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Company);
		System.out.println(driver);
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
		return new ViewLeadPage(driver);

	}
}
