package Session1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActionDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://text-compare.com/");
		driver.manage().window().maximize();
		
		
		
		//textarea[@id='inputText1']
		
		Actions act=new Actions(driver);
		
		WebElement dragElement=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement dropElement=driver.findElement(By.xpath("//div[@id='box103']"));
		WebElement drop1Element=driver.findElement(By.xpath("//div[@id='capitals']"));
		act.dragAndDrop(dragElement, dropElement).perform();
		act.dragAndDrop(dragElement, drop1Element).perform();
		
	}

}
