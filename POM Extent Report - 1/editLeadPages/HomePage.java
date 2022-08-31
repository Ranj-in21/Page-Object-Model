package editLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import parentClass.ProjectSpecificationMethod;


public class HomePage extends ProjectSpecificationMethod{
	
	public HomePage(ChromeDriver driver, ExtentTest node) {
		
		this.driver = driver;
		this.node = node;
	}
	
	public MyHomePage clickCrmsfa() {
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println(driver);
		return new MyHomePage(driver, node);
		

	}

}
