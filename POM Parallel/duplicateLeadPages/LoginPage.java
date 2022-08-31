package duplicateLeadPages;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificationMethod;

public class LoginPage extends ProjectSpecificationMethod {
	
	public LoginPage(ChromeDriver driver) {
		
		this.driver = driver;
	}
	
	public LoginPage enterUserName(String UserName) {
		
		driver.findElement(By.id("username")).sendKeys(UserName);
		System.out.println(driver);
		return this;
		
	}
	
	public LoginPage enterPassword(String Password) {
		
		driver.findElement(By.id("password")).sendKeys(Password);
		return this;

	}
	
	public HomePage clickLogin() {
		
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);

	}
	

}
