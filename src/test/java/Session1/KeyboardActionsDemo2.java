package Session1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//If click link directly it will open in the same page but requirement is it has to open in another page (New tab)
		WebElement RegisterLink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).click(RegisterLink).keyUp(Keys.CONTROL).perform();
		Set<String> s=driver.getWindowHandles();
		List<String> winid=new ArrayList(s);
		//System.out.println(s);
		String ParentWindow= winid.get(0);
		String ChildWindow=winid.get(1);
		
		driver.switchTo().window(ChildWindow);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Nilan");
		driver.switchTo().window(ParentWindow);
		 System.out.println(driver.getTitle());
		
		 driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mac");
		 driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		 
		
		
	}

}
