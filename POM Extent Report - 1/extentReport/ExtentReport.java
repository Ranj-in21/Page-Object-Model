package extentReport;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	
	public static void main(String[] args) throws IOException {
		
		/*Step:1 Setup Physical report path*/
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Report/result.html");
		
		/*To keep the report history*/
		reporter.setAppendExisting(true);
		
		/*Step:2 Create object for Extent Report*/
		ExtentReports extent = new ExtentReports();
		
		/*Step:3 To attach data with physical file*/
		extent.attachReporter(reporter);
		
		/*Step:4 Create TestCases & assign test details*/
		ExtentTest LoginTest = extent.createTest("LoginTest", "Login Test for LeafTaps Application");
		LoginTest.assignCategory("Smoke Test");
		LoginTest.assignAuthor("Ranjini");
		
		ExtentTest CreateLeadTest = extent.createTest("Create Lead", "Create a lead with mandatory information");
		CreateLeadTest.assignCategory("Functionality Test");
		CreateLeadTest.assignAuthor("Ranjini");
		
		ExtentTest EditLeadTest = extent.createTest("Edit Lead", "Edit and update mandatory information");
		EditLeadTest.assignCategory("Regression Test");
		EditLeadTest.assignAuthor("Ranjini");
		
		ExtentTest DeleteLeadTest = extent.createTest("Delete Lead", "Delete a lead and verify the lead is deleted");
		DeleteLeadTest.assignCategory("Sanity Test");
		DeleteLeadTest.assignAuthor("Ranjini");
		
		ExtentTest DuplicateLeadTest = extent.createTest("Duplicate Lead", "Create a duplicate lead with mandatory information");
		DuplicateLeadTest.assignCategory("Exploratory Testing");
		DuplicateLeadTest.assignAuthor("Ranjini");
		
		ExtentTest MergeLeadTest = extent.createTest("Merge Lead", "Merge two different leads with mandatory information");
		MergeLeadTest.assignCategory("Retesting");
		MergeLeadTest.assignAuthor("Ranjini");
		
		/*Step:5 Step level status*/
		LoginTest.pass("Enter Username");
		LoginTest.pass("Enter Password");
		LoginTest.pass("Click Login button", MediaEntityBuilder.createScreenCaptureFromPath(".././Snaps/login.png" ).build());
		
		CreateLeadTest.pass("Click Create Lead");
		CreateLeadTest.pass("Enter Company Name");
		CreateLeadTest.pass("Enter First Name");
		CreateLeadTest.pass("Enter Last Name");
		CreateLeadTest.pass("Enter Phone Number");
		CreateLeadTest.pass("Click Lead button", MediaEntityBuilder.createScreenCaptureFromPath(".././Snaps/create.png").build());
		
		EditLeadTest.pass("Click Find Leads");
		EditLeadTest.pass("Click Phone");
		EditLeadTest.pass("Enter Phone Number");
		EditLeadTest.pass("Click Find Leads button");
		EditLeadTest.pass("Click LeadID");
		EditLeadTest.pass("Click Edit button");
		EditLeadTest.pass("Enter Company Name");
		EditLeadTest.pass("Click Update button", MediaEntityBuilder.createScreenCaptureFromPath(".././Snaps/edit.png").build());
		
		DeleteLeadTest.pass("Click Find Leads");
		DeleteLeadTest.pass("Click Phone");
		DeleteLeadTest.pass("Enter Phone Number");
		DeleteLeadTest.pass("Click Find Leads button");
		DeleteLeadTest.pass("Click LeadID");
		DeleteLeadTest.pass("Click Delete button");
		DeleteLeadTest.pass("Click Find Leads");
		DeleteLeadTest.pass("Enter LeadID");
		DeleteLeadTest.pass("No records to display", MediaEntityBuilder.createScreenCaptureFromPath(".././Snaps/delete.png").build());
		
		DuplicateLeadTest.pass("Click Find Leads");
		DuplicateLeadTest.pass("Click Phone");
		DuplicateLeadTest.pass("Enter Phone Number");
		DuplicateLeadTest.pass("Click Find Leads button");
		DuplicateLeadTest.pass("Click LeadID");
		DuplicateLeadTest.pass("Click Duplicate button");
		DuplicateLeadTest.pass("Click Create Lead button", MediaEntityBuilder.createScreenCaptureFromPath(".././Snaps/duplicate.png").build());
		
		MergeLeadTest.pass("Click Merge Leads");
		MergeLeadTest.pass("Click From Lead");
		MergeLeadTest.pass("Enter First Name");
		MergeLeadTest.pass("Click Find Leads button");
		MergeLeadTest.pass("Click LeadID");
		MergeLeadTest.pass("Click To Lead");
		MergeLeadTest.pass("Enter First Name");
		MergeLeadTest.pass("Click Find Leads button");
		MergeLeadTest.pass("Click LeadID");
		MergeLeadTest.pass("Click Merge button");
		MergeLeadTest.pass("Click Find Leads");
		MergeLeadTest.pass("Enter LeadID");
		MergeLeadTest.pass("No records to display", MediaEntityBuilder.createScreenCaptureFromPath(".././Snaps/merge.png").build());
		
		/*Step:6 Mandatory*/
		extent.flush();
		
	}

}
