package createLeadPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import parentClass.ProjectSpecificationMethod;



public class CreateLeadPage extends ProjectSpecificationMethod {
	
		public CreateLeadPage(ChromeDriver driver, ExtentTest node) {
			this.driver = driver;
			this.node =node;
			
		}

		public CreateLeadPage enterCompanyName(String Company) throws IOException {
			try {
				
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Company);
			
				reportStep(Company+" Company Name is entered successfully", "pass");
			}
			catch (Exception e) {
				
				reportStep("Wrongly entered Company Name " +e, "fail");
				
			}			
			return this;
	
		}
	
		public CreateLeadPage enterFirstName(String FirstName) {
		
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
			return this;
	
		}
	
		public CreateLeadPage enterLastName(String LastName) {

			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
			return this;
	
		}
		
		public CreateLeadPage enterPhoneNumber(String PhoneNumber) {
		
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(PhoneNumber);
			return this;
	
		}
	
		public ViewLeadPage clickCreateLeadButton() {
		
			driver.findElement(By.name("submitButton")).click();
			return new ViewLeadPage(driver,node);

	
		}
		
}
