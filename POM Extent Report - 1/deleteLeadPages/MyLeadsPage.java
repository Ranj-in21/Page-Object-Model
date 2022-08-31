package deleteLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import parentClass.ProjectSpecificationMethod;


public class MyLeadsPage extends ProjectSpecificationMethod {
	
	public MyLeadsPage(ChromeDriver driver, ExtentTest node) {
		
		this.driver = driver;
		this.node = node;
	}
	
	public FindLeadsPage clickFindLeads() {
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		//System.out.println(driver);
		
		return new FindLeadsPage(driver,node);
	
		}

}
