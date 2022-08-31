package mergeLeadPages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificationMethod;

public class MyLeadsPage extends ProjectSpecificationMethod{
	
	public MergeLeadPage clickMergeLeads() {
		
		driver.findElement(By.linkText("Merge Leads")).click();
	
		return new MergeLeadPage();
	}

	
	
}
