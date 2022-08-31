package duplicateLeadPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import parentClass.ProjectSpecificationMethod;

public class NewViewLeadPage extends ProjectSpecificationMethod{
	
	public NewViewLeadPage(ChromeDriver driver, ExtentTest node) {
		
		this.driver = driver;
		this.node = node;
	}
	
	public NewViewLeadPage verifyLead() throws IOException {
		try {
		String company = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(company);
		String fname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(fname);
		String lname = driver.findElement(By.id("viewLead_lastName_sp")).getText();
		System.out.println(lname);
		String actual = driver.findElement(By.id("viewLead_statusId_sp")).getText();
		System.out.println(actual);
		String expected = "Assigned";
		Assert.assertEquals(actual, expected);
		reportStep("Duplicate Lead is successfully created", "pass");
		}
		catch (Exception e) {
			
			reportStep("Duplicate Lead failed" +e, "fail");
		}
		return this;
		
		
	}

}
