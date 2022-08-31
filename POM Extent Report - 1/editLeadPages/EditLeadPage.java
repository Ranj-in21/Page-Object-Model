package editLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import parentClass.ProjectSpecificationMethod;


public class EditLeadPage extends ProjectSpecificationMethod {
	
		public EditLeadPage(ChromeDriver driver, ExtentTest node) {
		
			this.driver = driver;
			this.node = node;
			
		}
	
		public EditLeadPage enterCompanyName(String Company) {
		
			driver.findElement(By.id("updateLeadForm_companyName")).clear();
			//System.out.println(driver);
			driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(Company);
			return this;
		}
	
	
		public UpdatedViewLeadPage clickUpdate() {
		
			driver.findElement(By.name("submitButton")).click();
		
			return new UpdatedViewLeadPage(driver,node);

		}

}
