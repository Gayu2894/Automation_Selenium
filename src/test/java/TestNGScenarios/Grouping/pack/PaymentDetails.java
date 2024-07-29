package TestNGScenarios.Grouping.pack;

import org.testng.annotations.Test;

public class PaymentDetails {

	
	@Test(priority=1,groups= {"Sanity","Regression","Functional"})
	void PaymentInRupees()
	{
		System.out.println("This is Rupees");
	}
	
	@Test(priority=2,groups= {"Sanity","Regression","Functional"})
	void PaymentInDollar()
	{
		System.out.println("This is Dollar");
	}
	
	@Test(priority=3,groups= {"Sanity","Regression","Functional"})
	void PaymentInRingit()
	{
		System.out.println("This is Ringit");
	}
	
}
