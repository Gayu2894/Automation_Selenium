package TestNGScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAssertions {

	
	
	@Test
	void testHardAssertions()
	{
		
		System.out.println("Birds");
		System.out.println("Animals");
		Assert.assertEquals(1,2);
		System.out.println("plants");
		System.out.println("Trees");
		
		
	}
	
    @Test
	void testSoftAssertions()
	{
		System.out.println("Birds");
		System.out.println("Animals");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 2);
		
		System.out.println("plants");
		System.out.println("Trees");
		sa.assertAll();
	}
}
