package TestNGScenarios;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {

	@Test
	void ab()
	{
		System.out.println("testing from c2....");
	}
	
	@AfterTest
	void bc()
	{
		System.out.println("Running After Test");
	}
}
