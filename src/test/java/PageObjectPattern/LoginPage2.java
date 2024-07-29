package PageObjectPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//WithPageFactory class
public class LoginPage2 {

	
WebDriver driver;
	
	//Constructor
	LoginPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_UserName_Loc;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_Password_Loc;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_Login;

	//ActionMethods
	
	public void setUserName(String usr)
	{
		txt_UserName_Loc.sendKeys(usr);
	}
	
	public void setPassword(String pwd)
	{
		txt_Password_Loc.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btn_Login.click();
	}
	
}
