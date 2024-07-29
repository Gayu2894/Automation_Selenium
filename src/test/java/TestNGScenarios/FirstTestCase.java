package TestNGScenarios;

import org.testng.annotations.Test;

public class FirstTestCase {

/*Open App
 * Login
 * Logout
 */
	
	@Test(priority=30)
	void APPOpenApp()
	{
		System.out.println("app opening....");
	}
	
	@Test(priority=0)
	void Login()
	{
		System.out.println("Log in....");
	}
	
	@Test(priority=30)
	void Logout()
	{
		System.out.println("Log Out....");
	}

}
