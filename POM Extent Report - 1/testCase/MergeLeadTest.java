package testCase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import mergeLeadPages.LoginPage;
import parentClass.ProjectSpecificationMethod;

public class MergeLeadTest extends ProjectSpecificationMethod{

	
		@BeforeTest
		
	public void setFile() {
	
		excelFile = "MergeLead";
		testName = "MergeLeadTest";
		testDescription = "Merge two different leads with mandatory information";
		testCategory = "Retesting";
		testAuthor = "Ranjini";
		}


		@Test(dataProvider = "TestData")
	public void runMergeLead(String UserName, String Password, String FirstName,
		String FirstName1) throws InterruptedException, IOException {
	
			LoginPage lp = new LoginPage(driver,node);
			System.out.println(driver);
			lp.enterUserName(UserName).enterPassword(Password).clickLogin()
			.clickCrmsfa().clickLeads().clickMergeLeads()
			.clickMergeButton(FirstName, FirstName1).clickAlert()
			.clickAgainFindLeads().enterLead()
			.clickFindLeadsButton().verifyLead();
			
	
		}
}
