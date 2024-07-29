package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		//isDisplayed() - applicable for all kinds of elements
		WebElement logo_Present=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	    System.out.println("Display Status of the Logo is: "+logo_Present.isDisplayed());
	    
	    //isEnabled() - applicable for input box, check box, Radio button
	    boolean FNameStatus=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
	    System.out.println("Display status of FirstName: "+FNameStatus);
	    
	    //isSelected()
	    WebElement maleRadioButtonStatus=driver.findElement(By.xpath("//input[@id='gender-male']"));
	    WebElement femaleRadioButtonStatus=driver.findElement(By.xpath("//input[@id='gender-female']"));
	    
	    System.out.println("Radio Button Status - Before Selection......");
	    System.out.println("Status of Radio Button Male: "+maleRadioButtonStatus.isSelected());
	    System.out.println("Status of Radio Button feMale: "+femaleRadioButtonStatus.isSelected());
	    
	    maleRadioButtonStatus.click();
	    System.out.println("Radio Button Status - After Selecting Male Radio Button......");
	    System.out.println("Status of Radio Button Male: "+maleRadioButtonStatus.isSelected());
	    System.out.println("Status of Radio Button feMale: "+femaleRadioButtonStatus.isSelected());
	    
	    femaleRadioButtonStatus.click();
	    System.out.println("Radio Button Status - After Selecting FeMale Radio Button......");
	    System.out.println("Status of Radio Button Male: "+maleRadioButtonStatus.isSelected());
	    System.out.println("Status of Radio Button feMale: "+femaleRadioButtonStatus.isSelected());
	    
	    boolean NewLetterCheckBoxStatus=driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
	    System.out.println("NewsLetter Checkbox Status: "+NewLetterCheckBoxStatus);
	    Thread.sleep(10000);
	    driver.close();
	}

}

