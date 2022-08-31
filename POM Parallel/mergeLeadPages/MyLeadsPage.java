package mergeLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificationMethod;


public class MyLeadsPage extends ProjectSpecificationMethod{
	
	public MyLeadsPage(ChromeDriver driver) {
		
		this.driver = driver;
	
	}
	
	public MergeLeadPage clickMergeLeads() {
		
		driver.findElement(By.linkText("Merge Leads")).click();
		
	//	System.out.println(driver);
		
		return new MergeLeadPage(driver);
	}

	
	
}
