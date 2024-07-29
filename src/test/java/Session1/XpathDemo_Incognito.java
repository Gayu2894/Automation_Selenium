package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathDemo_Incognito      {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		ChromeOptions options1=new ChromeOptions();
		options1.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		

		WebDriver driver=new ChromeDriver(options );
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//xpath with single attribute
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mac");
		
		//xpath with multiple attributes
		//driver.findElement(By.xpath("//input[@name='q'or @placeholder='Sear store']")).sendKeys("Mac");
		
		//xpath with text() - inner text (Without using attributes
		//driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		boolean displayStatus=driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).isDisplayed();
		System.out.println(displayStatus);
		
		//to get text of an element
		String displayText=driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).getText();
		System.out.println(displayText);
		
        //Xpath with contains() 
		driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("mac");
		
		//xpath with starts-with() 
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("books"); 
		
		
		
		
	}

}

//img[@title='Show products in category Electronics']