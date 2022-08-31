package duplicateLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificationMethod;


public class MyLeadsPage extends ProjectSpecificationMethod{
	
	public MyLeadsPage(ChromeDriver driver) {
		
		this.driver = driver;
	}
	public FindLeadsPage clickFindLeads() {
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		System.out.println(driver);
		
		return new FindLeadsPage(driver);
	
		}

}
