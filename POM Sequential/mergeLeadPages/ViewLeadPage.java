package mergeLeadPages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificationMethod;

public class ViewLeadPage extends ProjectSpecificationMethod {
	
	public FindLeadsPage clickAgainFindLeads() {

		driver.findElement(By.linkText("Find Leads")).click();
		
		return new FindLeadsPage();

	}

}
