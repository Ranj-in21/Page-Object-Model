package testCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.ProjectSpecificationMethod;
import editLeadPages.LoginPage;

public class EditLeadTest extends ProjectSpecificationMethod{
	
	
	@BeforeTest
	
		public void setFile() {
		
			excelFile = "EditLead";
		}
	
	
	@Test(dataProvider = "TestData")
	public void runEditLead(String UserName, String Password, String Number,
			String Company) throws InterruptedException {
		
		LoginPage lp = new LoginPage();
		lp.enterUserName(UserName).enterPassword(Password).clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLeads()
		.clickPhone().enterPhoneNumber(Number).clickFindLeadsButton().clickLeadId()
		.clickEdit().enterCompanyName(Company).clickUpdate()
		.verifyLead(Company, Company);
		
		

	}

}
