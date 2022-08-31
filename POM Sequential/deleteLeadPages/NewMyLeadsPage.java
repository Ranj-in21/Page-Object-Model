package deleteLeadPages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificationMethod;

public class NewMyLeadsPage extends ProjectSpecificationMethod {
	
		public NewFindLeadsPage clickFindLeadsAgain() {
		
			driver.findElement(By.xpath("//li/a[text()='Find Leads']")).click();
			return new NewFindLeadsPage();
			
		}

}
