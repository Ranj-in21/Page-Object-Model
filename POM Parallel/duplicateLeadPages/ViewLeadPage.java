package duplicateLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificationMethod;

public class ViewLeadPage extends ProjectSpecificationMethod{
	
	public ViewLeadPage(ChromeDriver driver) {
		
		this.driver = driver;
	}
	
	public DuplicateLeadPage clickDuplicate() {
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		System.out.println(driver);

		return new DuplicateLeadPage(driver);
	}
	
	
}
