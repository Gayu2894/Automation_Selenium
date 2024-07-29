package TestNGScenarios;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsDemo2 {

	
	 @BeforeClass
	void login()
	{
	  System.out.println("Log in.....");	
	}
	
	 @AfterClass
	void logout()
	{
		System.out.println("Log out....");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("Searching...");
	}
	
	@Test(priority=2)
	void advsearch()
	{
		System.out.println("Advance Searching...");
	}

	
}





