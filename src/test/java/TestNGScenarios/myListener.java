package TestNGScenarios;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class myListener implements ITestListener{
 
	//will run only once
	 public void onStart(ITestContext context) {

		 System.out.println("Test Execution is started.....");
		  }
	 
	 //will run before every test method
	public void onTestStart(ITestResult result) {
	    
		 System.out.println("Test method is started.....");
		
	  }
	
	 public void onTestSuccess(ITestResult result) {

		 System.out.println("Test passed");
		  }
	 
	 public void onTestFailure(ITestResult result) {
		 System.out.println("Test failed");
		  }
	 
	 public void onTestSkipped(ITestResult result) {
		 System.out.println("Test skipped");
		  }
	 
	
	 //will run only once after execution is completed 
	 public void onFinish(ITestContext context) {
		 System.out.println("Test Execution completed.....");
		  }


}
