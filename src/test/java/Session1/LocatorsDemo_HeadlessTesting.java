package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorsDemo_HeadlessTesting {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=new");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.nopcommerce.com/");
		//By name 
		driver.findElement(By.name("q")).sendKeys("mac");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		System.out.println("Successful Launch");
		//driver.close();
		
		//header-logo
		
		
	}

}
