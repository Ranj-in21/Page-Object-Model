package testCase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import mergeLeadPages.LoginPage;


public class MergeLeadTest extends ProjectSpecificationMethod{

	
		@BeforeTest
		
	public void setFile() {
	
		excelFile = "MergeLead";
		
		}


		@Test(dataProvider = "TestData")
	public void runMergeLead(String UserName, String Password, String FirstName,
		String FirstName1) throws InterruptedException, IOException {
	
			LoginPage lp = new LoginPage(driver);
			System.out.println(driver);
			lp.enterUserName(UserName).enterPassword(Password).clickLogin()
			.clickCrmsfa().clickLeads().clickMergeLeads()
			.clickMergeButton(FirstName, FirstName1).clickAlert()
			.clickAgainFindLeads().enterLead()
			.clickFindLeadsButton().verifyLead();
			
	
		}
}
