package duplicateLeadPages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificationMethod;

public class DuplicateLeadPage extends ProjectSpecificationMethod {
	
	public NewViewLeadPage clickCreateLead() {
		
		driver.findElement(By.name("submitButton")).click();
		
		return new NewViewLeadPage();

	}


}
