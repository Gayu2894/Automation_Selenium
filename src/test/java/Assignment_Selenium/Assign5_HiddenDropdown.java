package Assignment_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign5_HiddenDropdown {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(@href,'viewPim')]")).click();
		
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'][normalize-space()='-- Select --'])[1]")).click();
		List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		//WebElement options= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='listbox']//span")));
		System.out.println("Job Titles are "+ options.size());
		for(WebElement e:options)
		{
			String value=e.getText();
			if(value.equalsIgnoreCase("Full-Time Probation"))
			{
				try {
			 System.out.println(e.getText()+" is selected");
			 Thread.sleep(5000);
			 e.click();
				}catch(Exception e1)
				{
					System.out.println(e1.getMessage());
				}
			}
			
		}
		driver.quit();
		
	}}
	

