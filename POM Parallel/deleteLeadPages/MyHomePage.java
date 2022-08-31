package deleteLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificationMethod;


public class MyHomePage extends ProjectSpecificationMethod{
	
		public MyHomePage(ChromeDriver driver) {
		
			this.driver = driver;
		}
	
		public MyLeadsPage clickLeads() {
		
			driver.findElement(By.linkText("Leads")).click();
			
			System.out.println(driver);
			
			return new MyLeadsPage(driver);
		

	}

}
