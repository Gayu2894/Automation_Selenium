package Session1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement min=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		System.out.println("Minimum slide location "+min.getLocation());//(59,249)
		act.dragAndDropBy(min, 130, 249).perform();
		WebElement max=driver.findElement(By.xpath("//span[2]"));
		System.out.println("Maximum slide location "+max.getLocation());//(59,249)
		act.dragAndDropBy(max, -130, 249).perform();
		driver.quit();
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
