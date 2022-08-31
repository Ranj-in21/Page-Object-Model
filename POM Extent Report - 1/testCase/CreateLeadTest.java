package testCase;


import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import createLeadPages.LoginPage;
import parentClass.ProjectSpecificationMethod;

public class CreateLeadTest extends ProjectSpecificationMethod{
	
		@BeforeTest
		public void setFile() {
			
			excelFile = "CreateLead";
			testName = "CreateLeadTest";
			testDescription = "Create a lead with mandatory information";
			testCategory = "Functionality Test";
			testAuthor = "Ranjini";
			
		}
	
		@Test(dataProvider ="TestData")
		public void runCreateLead(String UserName, String Password, String Company, 
				String FirstName, String LastName, String PhoneNumber) throws IOException {
			
			LoginPage lp = new LoginPage(driver,node);
		
			lp.enterUserName(UserName).enterPassword(Password).clickLogin()
			.clickCrmsfa()
			.clickLeads()
			.clickCreateLead()
			.enterCompanyName(Company).enterFirstName(FirstName).enterLastName(LastName).enterPhoneNumber(PhoneNumber)
			.clickCreateLeadButton().verifyLead(FirstName);
			
		}
	

}
