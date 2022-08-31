package testCase;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import createLeadPages.LoginPage;

public class CreateLead extends ProjectSpecificationMethod{
	
		@BeforeTest
		public void setFile() {
		
			excelFile = "CreateLead";

		}
	
		@Test(dataProvider ="TestData")
		public void runCreateLead(String UserName, String Password, String Company, 
				String FirstName, String LastName, String PhoneNumber) {
			
			LoginPage lp = new LoginPage(driver);
			System.out.println(driver);
			lp.enterUserName(UserName).enterPassword(Password).clickLogin()
			.clickCrmsfa()
			.clickLeads()
			.clickCreateLead()
			.companyName(Company).firstName(FirstName).lastName(LastName).phoneNumber(PhoneNumber)
			.clickCreateLeadButton().verifyLead(FirstName);
			
		}
	

}
