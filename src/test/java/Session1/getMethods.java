package Session1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//get() - to launch the application url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//getTitle() - returns the title of the WebPage
		String Title=driver.getTitle();
		System.out.println("Title of the Web Page: "+Title);
		
		//getCurrentURL() -returns String
		System.out.println(driver.getCurrentUrl());
		
		//getPagesource()
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle()
		String WindowId=driver.getWindowHandle();
		System.out.println("Window Id:"+WindowId);
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		//getWindowsHandles()
		Set<String> windows_IDs=driver.getWindowHandles();
		System.out.println(windows_IDs);
		
		
		
	}

}
