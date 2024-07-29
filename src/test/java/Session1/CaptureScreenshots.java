package Session1;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class CaptureScreenshots {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		/*	
		TakesScreenshot ts=(TakesScreenshot) driver;
																				
		//Full page Screenshot till Selenium 3.X
		 * 
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		File targetFile=new File(System.getProperty("user.dir")+"\\Screenshots\\FullPage.png");
		sourceFile.renameTo(targetFile);
		*/
		
		/*
		 After Selenium 4
		//particular WebElement Section
		RemoteWebElement FeaturedProducts=(RemoteWebElement) driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sourceFile1=FeaturedProducts.getScreenshotAs(OutputType.FILE);
		File targetFile1=new File (System.getProperty("user.dir")+"\\Screenshots\\FeaturedProducts.png");
		sourceFile1.renameTo(targetFile1);
		*/
		
		//Particular WebElement
		RemoteWebElement logo=(RemoteWebElement) driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourceFile2=logo.getScreenshotAs(OutputType.FILE);
		File targetFile2=new File (System.getProperty("user.dir")+"\\Screenshots\\nopcommercelogo.png");
		sourceFile2.renameTo(targetFile2);
		
		
		
		//driver.quit();
		
		
		
		
		
		
		
		
	}

}

