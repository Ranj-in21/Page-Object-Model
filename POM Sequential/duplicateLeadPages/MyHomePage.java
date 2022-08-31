package duplicateLeadPages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificationMethod;

public class MyHomePage extends ProjectSpecificationMethod {
	
	public MyLeadsPage clickLeads() {
		
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage();
		

	}

}
