package TestNGScenarios.Grouping.pack;

import org.testng.annotations.Test;

public class Login {

	
	
	@Test(priority=1,groups= {"Sanity"})
	void LoginByEmail()
	{
		System.out.println("This Login from Email");
	}
	
	@Test(priority=2,groups= {"Sanity"})
	void LoginByFaceBook()
	{
		System.out.println("This Login from Facebook");
	}
	
	@Test(priority=3,groups= {"Sanity"})
	void LoginByTwitter()
	{
		System.out.println("This Login from Twitter");
	}
	
}
