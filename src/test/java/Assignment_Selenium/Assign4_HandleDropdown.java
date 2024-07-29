package Assignment_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign4_HandleDropdown {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		WebElement dropele=driver.findElement(By.xpath("//select[@id='colors']"));
		Select dropvalue=new Select(dropele);
		List<WebElement> clrvalue=dropvalue.getOptions();
		
		for(WebElement e:clrvalue)
		{
			String option=e.getText();
			if(option.equalsIgnoreCase("white")||option.equalsIgnoreCase("red")||option.equalsIgnoreCase("green"))
			{
			System.out.println(e.getText()+" is selected color");
				e.click();
			}
		}

	}

}




















