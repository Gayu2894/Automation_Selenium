package Session1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScrollingPages {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//Scroll the page by pixel
		//js.executeScript("window.scrollBy(0,500)", "");
        //System.out.println(js.executeScript("return window.pageYOffset;", "")); 		
		
        
        //Scroll the page till element is visible
        /*WebElement element=driver.findElement(By.xpath("//h2[normalize-space()='Web Table']"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		System.out.println(js.executeScript("return window.pageYOffset;"));
	    */
		
		//Scroll the page till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
	    //Scroll the page in reverse to reach at the top
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
	
	}

}
