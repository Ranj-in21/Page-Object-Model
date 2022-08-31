package mergeLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import parentClass.ProjectSpecificationMethod;


public class MyLeadsPage extends ProjectSpecificationMethod{
	
	public MyLeadsPage(ChromeDriver driver, ExtentTest node) {
		
		this.driver = driver;
		this.node = node;
	}
	
	public MergeLeadPage clickMergeLeads() {
		
		driver.findElement(By.linkText("Merge Leads")).click();
		
	//	System.out.println(driver);
		
		return new MergeLeadPage(driver,node);
	}

	
	
}
