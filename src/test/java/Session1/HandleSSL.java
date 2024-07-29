package Session1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(options);
		driver.navigate().to("https://expired.badssl.com/");
		System.out.println(driver.getTitle()); //before calling options its thrown privacy error as result 
		//after calling options it was given actual url title		
      
	}

}
