package testCase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import deleteLeadPages.LoginPage;
import parentClass.ProjectSpecificationMethod;

public class DeleteLeadTest extends ProjectSpecificationMethod{
	
	
	
	@BeforeTest
	public void setFile() {
		
		excelFile = "DeleteLead";
		testName = "DeleteLeadTest";
		testDescription = "Delete a lead and verify the lead is deleted";
		testCategory = "Sanity Test";
		testAuthor = "Ranjini";

	}
	
	@Test(dataProvider = "TestData")
	public void runDeleteLead(String UserName, String Password, String Number) throws InterruptedException, IOException {
	
		LoginPage lp = new LoginPage(driver,node);
		System.out.println(driver);
		lp.enterUserName(UserName).enterPassword(Password).clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLeads()
		.clickPhone().enterPhoneNumber(Number).clickFindLeadsButton()
		.clickDelete()
		.clickFindLeadsAgain()
		.enterLeadID().verifyDeleteLead();
		
		

	}
	
	

}
