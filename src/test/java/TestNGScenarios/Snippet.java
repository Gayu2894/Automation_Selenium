package TestNGScenarios;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Snippet {
	@Test
	void ab()
	{
		System.out.println("testing....");
	}
	
	@BeforeTest
	void bc()
	{
		System.out.println("Running Before Test");
	}
}

