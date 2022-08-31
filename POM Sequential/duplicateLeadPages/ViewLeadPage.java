package duplicateLeadPages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificationMethod;

public class ViewLeadPage extends ProjectSpecificationMethod{
	
	public DuplicateLeadPage clickDuplicate() {
		
		driver.findElement(By.linkText("Duplicate Lead")).click();

		return new DuplicateLeadPage();
	}
	
	
}
