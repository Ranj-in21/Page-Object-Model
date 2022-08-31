package testCase;


import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import createLeadPages.LoginPage;
import parentClass.ProjectSpecificationMethod;

public class LoginTest extends ProjectSpecificationMethod {
	
		@BeforeTest
		public void setFile() {
			
			excelFile = "Login";
			testName = "LoginTest";
			testDescription = "Login Test for LeafTaps Application";
			testCategory = "Smoke Test";
			testAuthor = "Ranjini";
			
		}
	
		@Test(dataProvider = "TestData")
		public void runLogin(String UserName, String Password) throws IOException {
		
		LoginPage lp = new LoginPage(driver,node);
		lp.enterUserName(UserName).enterPassword(Password).clickLogin();
		

	}

}
