package editLeadPages;

import org.openqa.selenium.By;
import org.testng.Assert;

import baseClass.ProjectSpecificationMethod;

public class UpdatedViewLeadPage extends ProjectSpecificationMethod{

		public UpdatedViewLeadPage verifyLead(String Company, String expected) throws InterruptedException {
			Thread.sleep(2000);
			String actual = driver.findElement(By.xpath("//td/span[@id='viewLead_companyName_sp']")).getText();
			System.out.println("Updated Company Name: " +actual);
			Assert.assertEquals(Company, expected);
			return this;
	}
	
}
