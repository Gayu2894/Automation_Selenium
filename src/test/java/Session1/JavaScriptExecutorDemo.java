package Session1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement Fname=driver.findElement(By.xpath("//input[@id='name']"));
		js.executeScript("arguments[0].setAttribute('value','Nilan')", Fname);
		
		WebElement Gender=driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", Gender);
		
		//for highlight an element 
		WebElement TabHighlight=driver.findElement(By.xpath("//h2[normalize-space()='Tabs']"));
		js.executeScript("arguments[0].style.border='4px solid red'", TabHighlight);
		
     
	}

}
