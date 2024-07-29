package Session1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement> CheckBoxes_days=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        System.out.println("Size of the days: "+CheckBoxes_days.size());
       
       // List<WebElement> label_days=driver.findElements(By.xpath("//label[contains(text(),'day')]"));  
       
        //System.out.println(label_days.);
        
      String day=  driver.findElement(By.xpath("//input[@id='sunday']")).getText();
        
        System.out.println(day);
       // label_days.
      /*  for(WebElement w: CheckBoxes_days)
        {
        	w.click();
        }
        */
      /*  for(WebElement w1: label_days)
        {
        	 System.out.println(label_days.);
        }
        */
        //last 3 
       /* for(int i=4;i<CheckBoxes_days.size();i++)
        {
        	
        	CheckBoxes_days.get(i).click();
        	//if((label_days.contains("Sunday"))||(label_days.contains("Friday")))
        	//{
        	//	 CheckBoxes_days.get(i).click();
        	//}
        }
        */
        //select first 3 checkboxes
        for(int i=0;i<CheckBoxes_days.size();i++)
        {
        	if(i%2==0)
        	CheckBoxes_days.get(i).click();
        	//if((label_days.contains("Sunday"))||(label_days.contains("Friday")))
        	//{
        	//	 CheckBoxes_days.get(i).click();
        	//}
        }
        
      /*  
        //to unselect the checked element
        for(int i=0;i<CheckBoxes_days.size();i++)
        {
        	if(CheckBoxes_days.get(i).isSelected())
        	{
        	CheckBoxes_days.get(i).click();
        	}
        	//if((label_days.contains("Sunday"))||(label_days.contains("Friday")))
        	//{
        	//	 CheckBoxes_days.get(i).click();
        	//}
        }*/
	}

}

//input[@class='form-check-input' and @type='checkbox']