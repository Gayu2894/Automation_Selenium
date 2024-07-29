package Session1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		
		Set<String> WindowsID=driver.getWindowHandles();
		
		//Approach 1
		//converting set of string to list array list since no get() method in set 
		List<String> wId=new ArrayList(WindowsID);
	/*	String Parent=wId.get(0);
		String Child=wId.get(1);
		
		//Switching to Child Window;
		driver.switchTo().window(Child);
		System.out.println("Child Window Title: "+driver.getTitle());
		
		//Switching again to parent window
		driver.switchTo().window(Parent);
		System.out.println("Parent Window Title: "+driver.getTitle());
	*/	
		//Approach 2:
	/*	for(int i=0;i<wId.size();i++)
		{
			driver.switchTo().window(wId.get(i));
			System.out.println(driver.getTitle());
		}
	*/	
	  //Approach 3: using enhanced forloop
     for(String s:wId)
      {
    	  String title=driver.switchTo().window(s).getTitle();
    	  if(title.contains("Human Resources"))
    	  {
    		  driver.findElement(By.xpath("//input[@name='action_request']")).click();
    		  System.out.println("CurrentUrl is : "+driver.getCurrentUrl());
    		  System.out.println("Current Page Title is : "+driver.getTitle());
    	  }
 
      }
		
		
   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.quit();
		
		
		
		
		
	}

}
