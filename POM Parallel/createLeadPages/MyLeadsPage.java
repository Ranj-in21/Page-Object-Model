
package createLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificationMethod;

public class MyLeadsPage extends ProjectSpecificationMethod {
	
public MyLeadsPage(ChromeDriver driver) {
		
		this.driver = driver;
	}
	
	public CreateLeadPage clickCreateLead() {
		
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}

}
