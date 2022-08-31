package duplicateLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import parentClass.ProjectSpecificationMethod;


public class ViewLeadPage extends ProjectSpecificationMethod{
	
	public ViewLeadPage(ChromeDriver driver, ExtentTest node) {
		
		this.driver = driver;
		this.node = node;
	}
	
	public DuplicateLeadPage clickDuplicate() {
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		//System.out.println(driver);

		return new DuplicateLeadPage(driver,node);
	}
	
	
}
