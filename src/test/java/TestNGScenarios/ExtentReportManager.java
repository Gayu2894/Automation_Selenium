package TestNGScenarios;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {

	public ExtentSparkReporter sparkReporter;//UI of the report(look and feel)
	public ExtentReports extent;//common info of the report
	public ExtentTest test;//Create the test case entries and update the test results
	
	//will run only once
	 public void onStart(ITestContext context) {

		 sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/Reports.html");
		 
		 sparkReporter.config().setDocumentTitle("Automation Testing Report");
		 sparkReporter.config().setReportName("Functional Testing");
		 sparkReporter.config().setTheme(Theme.STANDARD);
		 
		 extent=new ExtentReports();
		 extent.attachReporter(sparkReporter); //attaching common info to sparkreporter
		 
		 extent.setSystemInfo("Computer Name", "LocalHost");
		 extent.setSystemInfo("Operating System", "Windows10");
		 extent.setSystemInfo("Environment Name", "QA");
		 extent.setSystemInfo("Tester Name", "Gayathri");
		 extent.setSystemInfo("Browser Name", "Chrome");
		 
		  }
	 
	
	public void onTestSuccess(ITestResult result) {

		test=extent.createTest(result.getName());//Creating a new entry in the report with method name
		test.log(Status.PASS, "TestCase passed is : "+result.getName()); //update the status as pass with method name
		
		
		  }
	 
	 public void onTestFailure(ITestResult result) {

		test=extent.createTest(result.getName());//Creating a new entry in the report with method name
		test.log(Status.FAIL, "TestCase Failed is : "+result.getName()); //update the status as fail with method name
		test.log(Status.FAIL, "TestCase Failed cause is : "+result.getThrowable());	//will return error message
		
		  }
	 
	 public void onTestSkipped(ITestResult result) {

		test=extent.createTest(result.getName());//Creating a new entry in the report with method name
		test.log(Status.SKIP, "TestCase Skipped is : "+result.getName()); //update the status as skip with method name
		test.log(Status.SKIP, "TestCase Skipped cause is : "+result.getThrowable());	//will return error message
			
			
		  }
	 
	
	 //will run only once after execution is completed 
	 public void onFinish(ITestContext context) {
		
		 //must provide this method to write the report 
		 extent.flush();
		 
		 
		  }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
