package createLeadPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import parentClass.ProjectSpecificationMethod;


public class LoginPage extends ProjectSpecificationMethod {
	
		public LoginPage(ChromeDriver driver, ExtentTest node) {
		
			this.driver = driver;
			this.node = node;
	
		}
	
		public LoginPage enterUserName(String UserName) throws IOException {
		
			try {
				
				driver.findElement(By.id("username")).sendKeys(UserName);
				reportStep(UserName+" Username is successfully entered", "pass");	
			
			}
			catch (Exception e) {
				
				reportStep("Username is wrongly entered "+e, "fail");
				
			}
			return this;
	
		}
	
		public LoginPage enterPassword(String Password) throws IOException {
			
			try {
	
				driver.findElement(By.id("password")).sendKeys(Password);
				reportStep(Password+ " Password is successfully entered", "pass");
			}
			catch (Exception e) {
				
				reportStep("Password is wrongly entered " +e, "fail");
				
			}
			
			return this;
	
		}
	
	
		public HomePage clickLogin() throws IOException {
			
			try {
				driver.findElement(By.className("decorativeSubmit")).click();
				reportStep("Login button is clicked", "pass");
			
			}
			
			catch (Exception e) {
				reportStep("Login button is not clicked " +e,"fail" );
				
			}
		
			return new HomePage(driver,node);
	
		}
	
	

}
