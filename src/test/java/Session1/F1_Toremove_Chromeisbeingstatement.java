package Session1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/* Test case:
 * 1-Launch browser -chrome
 * 2-Open url - https://demo.opencart.com/
 * 3-Validate title should be "Your Store"
 * 4-Close Browser 
 */


//*[@name="q"]
public class F1_Toremove_Chromeisbeingstatement {

	public static void main(String[] args) throws InterruptedException {
		
		
		// to remove chrome is being automated text in the top
		ChromeOptions options =new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
	
		//System.out.println("Testing.....");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		//driver.findElement(By.className("btn btn-link navbar-btn")).click();
		
		
		
		
		
		
		String act_title=driver.getTitle();
	    Thread.sleep(1000);
		if(act_title.equals("nopCommerce demo store"))
		
		System.out.println("Test Passed");
		
		else
		{
		System.out.println("Test Failed");
		
		}
		System.out.println(act_title);
		//Thread.sleep(1000);*/
		//driver.quit();
   
	}

}
