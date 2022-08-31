package testCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.ProjectSpecificationMethod;
import createLeadPages.LoginPage;

public class LoginTest extends ProjectSpecificationMethod {
	
	@BeforeTest
	public void setFile() {
		
		excelFile = "Login";

	}
	
		@Test(dataProvider = "TestData")
	public void runLogin(String UserName, String Password) {
		
		LoginPage lp = new LoginPage();
		lp.enterUserName(UserName).enterPassword(Password).clickLogin();
		

	}
	
}
