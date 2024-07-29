package Assignment_Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign6_StaticTable_Flightbook {
	

	public static void main(String[] args) throws InterruptedException {
  
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		//choose departure city
		WebElement departcountry=driver.findElement(By.xpath("//select[@name='fromPort']"));
		//departcountry.click();
		Select dropCountry=new Select(departcountry);
		dropCountry.selectByVisibleText("Mexico City");
		//Thread.sleep(5000);
		
		//choose destination city
		WebElement destcountry=driver.findElement(By.xpath("//select[@name='toPort']"));
		//destcountry.click();
		Select dropdest=new Select(destcountry);
		dropdest.selectByVisibleText("London");
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		ArrayList al=new ArrayList();
		ArrayList al1=new ArrayList();
		//int al[]=new int[5];
		
		List<WebElement> pricedetails=driver.findElements(By.xpath("//table[@class='table']//td[6]"));
		System.out.println("Total Price Count:"+pricedetails.size());
		
		for(int i=1;i<=pricedetails.size();i++)
		{
			String a=driver.findElement(By.xpath("//table[@class='table']//tr["+i+"]//td[6]")).getText();
			String price= a.replace("$", "");
			double a2= Double.parseDouble(price);
	
			al.add(a2);
			al1.add(a2);

		}
		System.out.println("My ArrayList -Before sorting is: "+al1);
		
		Collections.sort(al);
	    System.out.println("My ArrayList -After sorting is: "+al);

		for(int i=0;i<al1.size();i++)
		{
			if(al1.get(i).equals(al.getFirst()))
			{
				driver.findElement(By.xpath("(//tr//td//input[@type='submit'])["+(i+1)+"]")).click();
				System.out.println("Minimum Price of flight "+al1.get(i));
			}
		
		}
	
		driver.findElement(By.name("inputName")).sendKeys("Nilan");
		driver.findElement(By.name("address")).sendKeys("KK Nagar");
		driver.findElement(By.name("city")).sendKeys("Madurai");
		driver.findElement(By.name("state")).sendKeys("Tamil Nadu");
		driver.findElement(By.name("zipCode")).sendKeys("625018");
		WebElement card=driver.findElement(By.xpath("//select[@name='cardType']"));
		Select value=new Select(card);
		value.selectByVisibleText("Diner's Club");
		driver.findElement(By.name("creditCardNumber")).sendKeys("12345678901");
		driver.findElement(By.name("creditCardMonth")).sendKeys("12");
		driver.findElement(By.name("creditCardYear")).sendKeys("2025");
		driver.findElement(By.name("nameOnCard")).sendKeys("Nilan Saravana");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement confirm=driver.findElement(By.xpath("//h1[contains(text(),'Thank you')]"));
		if(confirm.getText().equalsIgnoreCase("thank you for your purchase today!"))
		{
			System.out.println("Successfully booked the flight ticket");
		}
		driver.quit();
		
		
		
}

	
}

