package editLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificationMethod;

public class ViewLeadPage extends ProjectSpecificationMethod {
	
	public ViewLeadPage(ChromeDriver driver) {
		
		this.driver = driver;
	}
	
	public EditLeadPage clickEdit() {
		
		driver.findElement(By.linkText("Edit")).click();
		
		return new EditLeadPage(driver);
		
	}

}
