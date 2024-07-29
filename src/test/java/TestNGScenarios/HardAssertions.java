package TestNGScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	void test()
	{
		//All type of data can be validated using Assertions
		//Assert.assertEquals("xyz","xyz1"); //fail
		//Assert.assertEquals(123, 345); //fail
		
		//Assert.assertEquals("abc", 123);//fail
		
		//Assert.assertEquals("123", 123);//fail
		
		//Assert.assertNotEquals(123, 1233);//pass
		//Assert.assertNotEquals(123, 123);//fail
		
		//Assert.assertTrue(true);//pass
		
		//Assert.assertTrue(false);//fail
		
		//Assert.assertTrue(1==1);//pass
		
		//Assert.assertFalse(1==2);//pass
		
		//Assert.assertFalse(1==1);//fail
		
		//Assert.assertTrue(1==2);//fail
		
		
		//without checking any validation points it will make test method fail
		Assert.fail();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
