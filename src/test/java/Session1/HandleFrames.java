package Session1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//frame(Param)-passed as WebElement
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hello");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='mytext1']")).clear();
		
		//go back to page
		driver.switchTo().defaultContent();
		
		//frame2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Buddy");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='mytext2']")).clear();
		
		//go back to page
		driver.switchTo().defaultContent();
		
		//frame3 
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Welcome");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='mytext3']")).clear();
		
		//iframe - innerframe
		driver.switchTo().frame(0);
		WebElement f1=driver.findElement(By.xpath("//div[@id='i8']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("arguments[0].click()",f1);
				
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='i8']")).click();
	}

}


