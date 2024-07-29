package Session1;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 {
	
	
	   static Month convertMonth(String month)
	   {
		   HashMap<String, Month> monthMap=new HashMap<String, Month>();
		   monthMap.put("January", Month.JANUARY);
		   monthMap.put("February", Month.FEBRUARY);
		   monthMap.put("March", Month.MARCH);
		   monthMap.put("April", Month.APRIL);
		   monthMap.put("May", Month.MAY);
		   monthMap.put("June", Month.JUNE);
		   monthMap.put("July", Month.JULY);
		   monthMap.put("August", Month.AUGUST);
		   monthMap.put("September", Month.SEPTEMBER);
		   monthMap.put("October", Month.OCTOBER);
		   monthMap.put("November", Month.NOVEMBER);
		   monthMap.put("December", Month.DECEMBER);
		   
		   Month ObjMonth=monthMap.get(month);
		   if(ObjMonth==null)
		   {
			   System.out.println("Given Month is Invalid");
		   }
		   
		   return ObjMonth;
		   
	   }
	   
	   static void selectdate(WebDriver driver, String month,String year,String date)
	   {
			
			//Select year
			WebElement yearData=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
			Select s1=new Select(yearData);
			s1.selectByVisibleText(year);
			
			
			while(true)
			{
			//Select Month
			
			String displayMonth1=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			Month expectedMonth=convertMonth(month);
			Month displayMonth=convertMonth(displayMonth1);
			
			int value=expectedMonth.compareTo(displayMonth);
			
			if(value>0)
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				
			}
			else if(value<0)
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}
			//0=0 means expected month = display month here say  november = november
			else
			{
				break;
			}

			}
			
			//date selection
			
			List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
			for(WebElement dateValue:allDates)
			{
				if(dateValue.getText().equals(date))
				{
					dateValue.click();
				}
			}
		
	   }
	

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		
		String month="February";
		String year="2026";
		String date="13";
		convertMonth(month);
		selectdate(driver,month,year,date);
	
	}

}
