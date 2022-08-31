package editLeadPages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificationMethod;

public class EditLeadPage extends ProjectSpecificationMethod {
	
	public EditLeadPage enterCompanyName(String Company) {
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(Company);
		return this;
	}
	
	
	public UpdatedViewLeadPage clickUpdate() {
		
		driver.findElement(By.name("submitButton")).click();
		return new UpdatedViewLeadPage();

	}

}
