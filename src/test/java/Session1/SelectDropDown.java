package Session1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		


		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		WebElement dropele=driver.findElement(By.xpath("//select[@id='country']"));
		Select dropvalue=new Select(dropele);
		//dropvalue.selectByVisibleText("India");
		//dropvalue.selectByValue("uk");
		dropvalue.selectByIndex(9);
		
	    List<WebElement> options=dropvalue.getOptions();
	    System.out.println("Count of the dropdown options are  "+options.size());
	    
	    /*for(WebElement li:options)
	    {
	    	System.out.println(li.getText());
	    }
		*/
	    for(int i=0;i<options.size();i++)
	    {
	    	System.out.println(options.get(i).getText());
	    }
	    

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
	}

}
