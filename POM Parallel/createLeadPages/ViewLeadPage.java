package createLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.ProjectSpecificationMethod;

public class ViewLeadPage extends ProjectSpecificationMethod {
	
public ViewLeadPage(ChromeDriver driver) {
		
		this.driver = driver;
	}
	public ViewLeadPage verifyLead(String expected) {
		
		String actual= driver.findElement(By.id("viewLead_firstName_sp")).getText();
      
		System.out.println(actual);
        
		Assert.assertEquals(actual, expected);
		
		return this;
		 	
	}

}
