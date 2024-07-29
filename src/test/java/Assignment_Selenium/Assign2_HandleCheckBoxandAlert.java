package Assignment_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2_HandleCheckBoxandAlert {

	public static void main(String[] args) {

		

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement> CheckBoxes=driver.findElements(By.xpath("//tbody//input[@type='checkbox']"));
        System.out.println("Size of the days: "+CheckBoxes.size());
     /*   for(WebElement w:CheckBoxes) 
        {
        	w.click();
        	//System.out.println();
        	
        }
	*/
         for(int i=0;i<CheckBoxes.size();i++)
        {
             if(i%2!=0)
             {
        	 CheckBoxes.get(i).click();
             }
        }
	}

}
