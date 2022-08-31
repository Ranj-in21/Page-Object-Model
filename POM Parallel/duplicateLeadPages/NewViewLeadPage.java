package duplicateLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.ProjectSpecificationMethod;

public class NewViewLeadPage extends ProjectSpecificationMethod{
	
	public NewViewLeadPage(ChromeDriver driver) {
		
		this.driver = driver;
	}
	
	public NewViewLeadPage verifyLead() {
		
		String company = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(company);
		String fname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(fname);
		String lname = driver.findElement(By.id("viewLead_lastName_sp")).getText();
		System.out.println(lname);
		String actual = driver.findElement(By.id("viewLead_statusId_sp")).getText();
		System.out.println(actual);
		String expected = "Assigned";
		Assert.assertEquals(actual, expected);
		return this;
		
		
	}

}
