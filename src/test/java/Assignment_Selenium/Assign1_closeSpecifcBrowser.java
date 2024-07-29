package Assignment_Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1_closeSpecifcBrowser {

	public static void main(String[] args) {
		
		/* https://testautomationpractice.blogspot.com/
		   1) -provide some string -search for it
           2) count links
           3)click each link
           4)get each windows id
           5)close Specific broswer window
       */
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//search for any text
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Java");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		
		
	    List<WebElement> links=	driver.findElements(By.xpath("//a[contains(@href,'en.wikipedia.org')]"));
		
		System.out.println("Count of the Search Links are "+links.size());
		
		for(WebElement obj:links)
		{
			obj.click();
		}
		
	    Set<String> winIds=	driver.getWindowHandles();
	    List<String> Wid=new ArrayList(winIds);
	    System.out.println("Closing the links.........");
	    for(String s:Wid)
	    {
	    	String titles=driver.switchTo().window(s).getTitle();
	    	if((titles.equals("Java - Search results - Wikipedia"))||(titles.equals("Javanese language - Wikipedia"))||(titles.equals("JavaScript - Wikipedia")))
	    	{
	    		   
	    			System.out.println("Title of windows: "+driver.getTitle());
	    			System.out.println("Url of windows: "+driver.getCurrentUrl());
	    		    driver.close();
	      	}
	    			
	    }
		
	}

}
