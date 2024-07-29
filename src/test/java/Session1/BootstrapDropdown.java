package Session1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		
		WebElement dropele=driver.findElement(By.xpath("//button[contains(@class,'multiselect')]"));
		dropele.click();
		List<WebElement> values=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
	    System.out.println("Total number of Options:"+values.size());
	    for(WebElement w:values)
	    {
	      String option=w.getText();
	      if(option.equalsIgnoreCase("java") || option.equalsIgnoreCase("jquery") || option.equalsIgnoreCase("oracle"))
	      {
	    	 w.click();
	    	  
	      }
	    }
	    	
	
	}

}
//ul[contains(@class,'multiselect')]//label
//input[@type='checkbox']
//    

