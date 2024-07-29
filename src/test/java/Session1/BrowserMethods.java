package Session1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		//Implicit Wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Explicit Wait -Declaration
		//WebDriverWait myWait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//Fluent Wait -Declaration
		Wait<WebDriver> myWait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Explicit Wait - Usage
		//WebElement text=myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")));
		//text.click();
		//System.out.println("Successfully launched");
		
		//Fluent Wait -Usage
        WebElement text=myWait.until(new Function<WebDriver,WebElement>(){
        		public WebElement apply(WebDriver driver)
        		{
        			return (WebElement) driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]"));
        			}});
        
        text.click();
        System.out.println("Successfully launched");		
		
		
	//	driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		//driver.close();
		driver.quit();
	}

}
