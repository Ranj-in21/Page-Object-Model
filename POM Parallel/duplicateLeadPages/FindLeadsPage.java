package duplicateLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificationMethod;


public class FindLeadsPage extends ProjectSpecificationMethod {
	
	public FindLeadsPage(ChromeDriver driver) {
		
		this.driver = driver;
	}
	
	public FindLeadsPage clickPhone() {

		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		System.out.println(driver);
		
		return this;
	}
	
	public FindLeadsPage enterPhoneNumber(String Number) {
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(Number);
		return this;
	}
	
	public FindLeadsPage clickFindLeadsButton() {
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		return this;
	}
	
	public ViewLeadPage clickLeadID() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		return new ViewLeadPage(driver);
				
	}

}
