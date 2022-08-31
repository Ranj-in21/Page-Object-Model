package testCase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import editLeadPages.LoginPage;
import parentClass.ProjectSpecificationMethod;


public class EditLeadTest extends ProjectSpecificationMethod{
	
	
	@BeforeTest
	
		public void setFile() {
		
			excelFile = "EditLead";
			testName = "EditLeadTest";
			testDescription = "Edit and update mandatory information";
			testCategory = "Regression Test";
			testAuthor = "Ranjini";
		}
	
	
		@Test(dataProvider = "TestData")
		public void runEditLead(String UserName, String Password, String Number,
			String Company) throws InterruptedException, IOException {
		
			LoginPage lp = new LoginPage(driver,node);
			//System.out.println(driver);
			lp.enterUserName(UserName).enterPassword(Password).clickLogin()
			.clickCrmsfa()
			.clickLeads()
			.clickFindLeads()
			.clickPhone().enterPhoneNumber(Number).clickFindLeadsButton().clickLeadId()
			.clickEdit().enterCompanyName(Company).clickUpdate()
			.verifyLead(Company, Company);
			

	}

}
