package PageObjectPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Without Page Factory Class
public class LoginPage {

	
	WebDriver driver;
	
	//Constructor
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	
	By txt_UserName_Loc =By.xpath("//input[@placeholder='Username']");
	By txt_Password_Loc =By.xpath("//input[@placeholder='Password']");
	By btn_Login =By.xpath("//button[normalize-space()='Login']");
	

	//ActionMethods
	
	public void setUserName(String usr)
	{
		driver.findElement(txt_UserName_Loc).sendKeys(usr);
	}
	
	public void setPassword(String pwd)
	{
		driver.findElement(txt_UserName_Loc).sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		driver.findElement(btn_Login).click();
	}
	
}
