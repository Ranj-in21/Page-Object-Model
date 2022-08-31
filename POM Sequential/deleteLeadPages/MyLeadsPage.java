package deleteLeadPages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificationMethod;


public class MyLeadsPage extends ProjectSpecificationMethod {
	
	public FindLeadsPage clickFindLeads() {
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		return new FindLeadsPage();
	
		}

}
