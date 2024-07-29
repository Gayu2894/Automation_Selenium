package TestNGScenarios;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo1 {

	
	 @BeforeMethod
	void login()
	{
	  System.out.println("Log in.....");	
	}
	
	 @AfterMethod
	void logout()
	{
		System.out.println("Log out....");
	}
	
	@Test
	void search()
	{
		System.out.println("Searching...");
	}
	
	@Test
	void advsearch()
	{
		System.out.println("Advance Searching...");
	}
	
	
	
	
	
	
	
	
}





