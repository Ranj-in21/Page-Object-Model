package deleteLeadPages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificationMethod;

public class ViewLeadPage extends ProjectSpecificationMethod {
	
	
		public NewMyLeadsPage clickDelete() throws InterruptedException {
		
			Thread.sleep(2000);
			LeadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
			System.out.println(driver);
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			driver.findElement(By.linkText("Delete")).click();
			return new NewMyLeadsPage();
			
		}
			
			
			
			
			
			
				
				
			
			
}
