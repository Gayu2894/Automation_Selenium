package TestNGScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestNGScenarios.myListener.class)
public class OrangeHRMTestListenerDemo {


	WebDriver driver;
	
	@BeforeClass
	void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	void testLogo() throws InterruptedException
	{
		Thread.sleep(2000);
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(true, status);
		
		
	}
	
	@Test(priority=2)
	void testUrl() throws InterruptedException
	{
		String url="https://opensource-demo.orangehrmlive.com";
		Assert.assertEquals(driver.getCurrentUrl(), url);
	}
	
	@Test(priority=3,dependsOnMethods= {"testUrl"})
	void testTitle()
	{
		String title="OrangeHRM";
		Assert.assertEquals(driver.getTitle(), title);
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
	
	
	
}
