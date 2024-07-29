package Assignment_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign7_DynamicTable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(@href,'admin')]")).click();
		
		
	    List<WebElement> Columns=driver.findElements(By.xpath("//div[@role='rowgroup']"));
	    System.out.println("Columns are  "+Columns.size());
	    for(int c=1;c<=Columns.size();c++)
		{
			String values=driver.findElement(By.xpath("//div[@class='oxd-table']")).getText();
			System.out.print(values+"\t");
		}
	    System.out.print(" ");
		System.out.println();
	}

	}



