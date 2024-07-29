package TestNGScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestingDemo {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","url"})
	void setUp(String br,String url)
	{
        switch(br.toLowerCase())
        {
          case "chrome": driver=new ChromeDriver(); break;
          case "edge": driver=new EdgeDriver(); break;
          case "firefox":	driver=new FirefoxDriver(); break;
          default: System.out.println("invaid browser"); return; 
        }
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=1)
	void TestLogo() throws InterruptedException
	{
		Thread.sleep(2000);
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Logo is displayed....."+status);
	}
	
	@Test(priority=2)
	void testTitle() 
	{
		String title= "OrangeHRM";
		Assert.assertEquals(driver.getTitle(), title);
	}
	
	@Test(priority=3)
	void testUrl()
	{
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Assert.assertEquals(driver.getCurrentUrl(), url);
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
	
	
	
	
}
