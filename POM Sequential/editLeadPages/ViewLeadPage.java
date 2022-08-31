package editLeadPages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificationMethod;

public class ViewLeadPage extends ProjectSpecificationMethod {
	
	public EditLeadPage clickEdit() {
		
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage();
		
	}

}
