package deleteLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import parentClass.ProjectSpecificationMethod;

public class NewMyLeadsPage extends ProjectSpecificationMethod {
	
		public NewMyLeadsPage(ChromeDriver driver, ExtentTest node) {
			
			this.driver = driver;
			this.node = node;
			
		}
	
		public NewFindLeadsPage clickFindLeadsAgain() {
		
			driver.findElement(By.xpath("//li/a[text()='Find Leads']")).click();
			return new NewFindLeadsPage(driver,node);
			
		}

}
