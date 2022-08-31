package testCase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import duplicateLeadPages.LoginPage;
import parentClass.ProjectSpecificationMethod;


public class DuplicateLeadTest extends ProjectSpecificationMethod {
	
	@BeforeTest
	
	public void setFile() {
	
		excelFile = "DuplicateLead";
		testName = "DuplicateLeadTest";
		testDescription = "Create a duplicate lead with mandatory information";
		testCategory = "Exploratory Test";
		testAuthor = "Ranjini";
		
	}
	
	@Test(dataProvider = "TestData")
	public void runDuplicateLead(String UserName, String Password, String Number) throws InterruptedException, IOException {
		
		LoginPage lp = new LoginPage(driver,node);
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
