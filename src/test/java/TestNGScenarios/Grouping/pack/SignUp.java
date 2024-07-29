package TestNGScenarios.Grouping.pack;

import org.testng.annotations.Test;

public class SignUp {

	
	
	@Test(priority=3,groups= {"Regression"})
	void SignUpByEmail()
	{
		System.out.println("This SignUp from Email");
	}
	
	@Test(priority=5,groups= {"Regression"})
	void SignUpByFaceBook()
	{
		System.out.println("This SignUp from Facebook");
	}
	
	@Test(priority=4,groups= {"Regression"})
	void SignUpByTwitter()
	{
		System.out.println("This SignUp from Twitter");
	}
	
}
