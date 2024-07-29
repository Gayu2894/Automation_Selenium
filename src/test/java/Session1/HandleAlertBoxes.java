package Session1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertBoxes {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Without Using SwitchTo Alert()
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert alert3=wait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(alert3.getText());
	    alert3.accept();
	    
	    
		
		
		
		
		
	
		//driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		/*
		//Normal Alert Window
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
*/
	/*	//Confirm ok and cancel
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		//
		Alert myalert1=driver.switchTo().alert();
		System.out.println(myalert1.getText());
		myalert1.accept();
		WebElement resultok=driver.findElement(By.xpath("//p[@id='result']"));
		System.out.println(resultok.getText());
		if(resultok.getText().equals("You clicked: Ok"))
		{
			System.out.println("You accepted the pop up");
		}
	*/	
		/*
		//with prompt input
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert alert2=driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.sendKeys("Hello, How are you?");
		alert2.accept();
		WebElement resultok=driver.findElement(By.xpath("//p[@id='result']"));
		System.out.println(resultok.getText());
		if(resultok.getText().equals("You entered: "+"Hello, How are you?"))
		{
			System.out.println("Successfully entered");
		}
		else
		{
			System.out.println("Validation falied");
		}
    
    */
		//Without using SwitchTo() alert()
		
	
	}

}
