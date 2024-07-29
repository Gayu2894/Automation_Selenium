package TestNGScenarios;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {

	
	@Test
	void ab()
	{
		System.out.println("testing from c1....");
	}
	
	@BeforeTest
	void bc()
	{
		System.out.println("Running Before Test");
	}
}
