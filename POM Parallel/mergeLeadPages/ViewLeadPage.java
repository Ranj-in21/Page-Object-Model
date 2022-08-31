package mergeLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificationMethod;


public class ViewLeadPage extends ProjectSpecificationMethod {
	
	public ViewLeadPage(ChromeDriver driver) {
		
		this.driver = driver;
		
	}
	
	public FindLeadsPage clickAgainFindLeads() {

		driver.findElement(By.linkText("Find Leads")).click();
		
		return new FindLeadsPage(driver);

	}

}
