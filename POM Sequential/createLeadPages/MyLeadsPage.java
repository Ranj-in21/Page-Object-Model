package createLeadPages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificationMethod;

public class MyLeadsPage extends ProjectSpecificationMethod{
	
	public CreateLeadPage clickCreateLead() {
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		return new CreateLeadPage();

	}
	

}
