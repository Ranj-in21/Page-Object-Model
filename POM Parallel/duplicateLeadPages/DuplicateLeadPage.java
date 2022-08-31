package duplicateLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificationMethod;

public class DuplicateLeadPage extends ProjectSpecificationMethod {
	
	
	public DuplicateLeadPage(ChromeDriver driver) {
		
		this.driver = driver;
	}
	
	public NewViewLeadPage clickCreateLead() {
		
		driver.findElement(By.name("submitButton")).click();
		
		return new NewViewLeadPage(driver);

	}


}
