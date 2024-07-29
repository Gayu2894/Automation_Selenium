package Session1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Selenium4NewWindowhandle {

	public static void main(String[] args) {

		ChromiumDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		//-This one is for window opened in new tab -intro in Selenium till sel3 this command is not available
		//driver.switchTo().newWindow(WindowType.TAB);
		//This one is for New browser window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://demo.nopcommerce.com/");
		System.out.println(driver.getTitle());
		List<String>winIds=new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(winIds.get(0));
		System.out.println(driver.getTitle());
		
		
		driver.manage().window().maximize();
		driver.quit();

	}

}
