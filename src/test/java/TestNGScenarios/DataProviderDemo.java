package TestNGScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
       
	WebDriver driver;
	
	@BeforeClass
	void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider="dp")
	void testLogin(String email,String pwd) throws InterruptedException
	{
		driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		boolean status=driver.findElement(By.xpath("//span[normalize-space()='My Account']")).isDisplayed();
		if(status=true)
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
		    Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}
		
	}
	
	@AfterClass
	 void tearDown()
	 {
		driver.quit(); 
	 }
	
	 @DataProvider(name="dp",indices= {0,2,4})
	 Object[][] loginData()
	 {
		 Object[][] data= { {"abc@gmail.com","abc@123"},
		                    {"xyz@gmail.com","xyz@123"},
		                    {"test@gmail.com","test@123"},
		                    {"lmn@gmail.com","lmn@123"},
		                    {"GayathriSekar@gmail.com","Gayu@123"}
	                     	 };
		 
		 return data;
	 }
		
}
