package deleteLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificationMethod;


public class NewMyLeadsPage extends ProjectSpecificationMethod {
	
		public NewMyLeadsPage(ChromeDriver driver) {
			
			this.driver = driver;
			
		}
	
		public NewFindLeadsPage clickFindLeadsAgain() {
		
			driver.findElement(By.xpath("//li/a[text()='Find Leads']")).click();
			return new NewFindLeadsPage(driver);
			
		}

}
