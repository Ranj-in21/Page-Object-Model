package testCase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.ProjectSpecificationMethod;
import deleteLeadPages.LoginPage;


public class DeleteLeadTest extends ProjectSpecificationMethod{
		
	@BeforeTest
	public void setFile() {
		
		excelFile = "DeleteLead";
		}
	
	@Test(dataProvider = "TestData")
	public void runDeleteLead(String UserName, String Password, String Number) throws InterruptedException, IOException {
	
		LoginPage lp = new LoginPage();
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
