package editLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import parentClass.ProjectSpecificationMethod;

public class ViewLeadPage extends ProjectSpecificationMethod {
	
		public ViewLeadPage(ChromeDriver driver, ExtentTest node) {
		
			this.driver = driver;
			this.node = node;
		
		}
	
		public EditLeadPage clickEdit() {
		
			driver.findElement(By.linkText("Edit")).click();
		
			return new EditLeadPage(driver,node);
		
		}

}
