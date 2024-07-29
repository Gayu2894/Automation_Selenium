package Session1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {
	
	
	static void SelectFutureDate(WebDriver driver,String month,String year,String date)
	{
	//if not have size or conditions 
			while(true)
			{
			 
				String CurrentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				String CurrentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				
				if(CurrentMonth.equalsIgnoreCase(month)&&CurrentYear.equalsIgnoreCase(year))
				{
					break;
				}
				//next button
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
				List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
				//System.out.println();
				for(WebElement dt:allDates)
				{
					if(dt.getText().equals(date))
					{
						dt.click();
						System.out.println("Successfully selected the future date");
						//as soon as it got the date then it will break instead checking till 31 dates
						break;
						
					}
				}
			
			
	}
	
			static void SelectPastDate(WebDriver driver,String month,String year,String date)
			{
			//if not have size or conditions 
					while(true)
					{
					 
						String CurrentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
						String CurrentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
						if(CurrentMonth.equalsIgnoreCase(month)&&CurrentYear.equalsIgnoreCase(year))
						{
							break;
						}
						//previous button
					    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
						
					}
					    List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
						//System.out.println();
						for(WebElement dt:allDates)
						{
							if(dt.getText().equals(date))
							{
								dt.click();
							   System.out.println("Successfully selected the past date");
								//as soon as it got the date then it will break instead checking till 31 dates
								break;
								
							}
						}
					
			}
	

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//Method 1 : Using SendKeys
        driver.switchTo().frame(0);
       //driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("11/28/1994");
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//We have to pass everying in string format to an application
		String month="August";
		String year="2022";
		String date="12";
		SelectPastDate(driver,month,year,date);
		//SelectFutureDate(driver,month,year,date);
			
		}
		
	}


