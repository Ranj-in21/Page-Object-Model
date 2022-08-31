package testCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import duplicateLeadPages.LoginPage;


public class DuplicateLeadTest extends ProjectSpecificationMethod {
	
	@BeforeTest
	
	public void setFile() {
	
		excelFile = "DuplicateLead";
	}
	
	@Test(dataProvider = "TestData")
	public void runDuplicateLead(String UserName, String Password, String Number) throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		System.out.println(driver);
		lp.enterUserName(UserName).enterPassword(Password).clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLeads()
		.clickPhone().enterPhoneNumber(Number).clickFindLeadsButton().clickLeadID()
		.clickDuplicate()
		.clickCreateLead()
		.verifyLead();
		
	}

}
