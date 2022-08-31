package editLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificationMethod;

public class EditLeadPage extends ProjectSpecificationMethod {
	
	public EditLeadPage(ChromeDriver driver) {
		
		this.driver = driver;
	}
	
	public EditLeadPage enterCompanyName(String Company) {
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		System.out.println(driver);
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(Company);
		return this;
	}
	
	
	public UpdatedViewLeadPage clickUpdate() {
		
		driver.findElement(By.name("submitButton")).click();
		
		return new UpdatedViewLeadPage(driver);

	}

}
