package duplicateLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import parentClass.ProjectSpecificationMethod;

public class DuplicateLeadPage extends ProjectSpecificationMethod {
	
	
	public DuplicateLeadPage(ChromeDriver driver, ExtentTest node) {
		
		this.driver = driver;
		this.node = node;
	}
	
	public NewViewLeadPage clickCreateLead() {
		
		driver.findElement(By.name("submitButton")).click();
		
		return new NewViewLeadPage(driver,node);

	}


}
