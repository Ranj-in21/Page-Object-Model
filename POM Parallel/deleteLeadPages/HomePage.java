package deleteLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificationMethod;


public class HomePage extends ProjectSpecificationMethod {
	
		public HomePage(ChromeDriver driver) {
		
			this.driver = driver;
			
			}
	
		public MyHomePage clickCrmsfa() {
		
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			System.out.println(driver);
			
			return new MyHomePage(driver);
		

	}

}
