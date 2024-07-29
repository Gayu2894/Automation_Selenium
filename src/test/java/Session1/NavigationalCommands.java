package Session1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://www.google.com");
		//driver.navigate().to("https://www.google.com");
		//URL myUrl=new URL("https://www.google.com");
		//driver.navigate().to(myUrl);
		 try {
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	    driver.navigate().back();
	    System.out.println(driver.getCurrentUrl());
	    
	    driver.navigate().forward();
	    System.out.println(driver.getCurrentUrl());
	   
	    driver.navigate().refresh();
	    
	    
        driver.quit();
	    }catch(Exception e)
	    {
	    	System.out.println(e.getMessage());
	    }
	}

}
