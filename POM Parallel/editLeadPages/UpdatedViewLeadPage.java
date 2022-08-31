package editLeadPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.ProjectSpecificationMethod;

public class UpdatedViewLeadPage extends ProjectSpecificationMethod{

	public UpdatedViewLeadPage(ChromeDriver driver) {
		
		this.driver = driver;
		
	}
	
		public UpdatedViewLeadPage verifyLead(String Company, String expected) throws InterruptedException {
		
			Thread.sleep(2000);
			String actual = driver.findElement(By.xpath("//td/span[@id='viewLead_companyName_sp']")).getText();
			System.out.println("Company Name Updated: " +actual);
			Assert.assertEquals(Company, expected);
			return this;
	}
	
}
