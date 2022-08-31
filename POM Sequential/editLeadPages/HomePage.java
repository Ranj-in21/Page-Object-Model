package editLeadPages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificationMethod;

public class HomePage extends ProjectSpecificationMethod{
	
	public MyHomePage clickCrmsfa() {
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
		

	}

}
