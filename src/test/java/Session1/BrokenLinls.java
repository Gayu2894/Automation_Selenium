package Session1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinls {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total Links are"+links.size());
		
		int countlink=0;
		int nolink=0;
		int emptylink=0;
		
		for(WebElement linkElement:links) 
		{
			String hrefAttVal=linkElement.getAttribute("href");
			if(hrefAttVal.equals(null)||hrefAttVal.isEmpty())
			{
				System.out.println("Not possible to check if it is a broken links are not");
				emptylink++;
				continue;
				
			}
			
			try {
			//converting string to urlusing URL class
			URL linkvalue=new URL(hrefAttVal);
			
			//opening connection to the server
			HttpURLConnection conn=(HttpURLConnection) linkvalue.openConnection();
			
			//connected to the server and sent request to the server
			conn.connect();
			
			if(conn.getResponseCode()>=400)
			{
				System.out.println(linkvalue+"============> Broken Link");
				countlink++;
			}
			else
			{
				System.out.println(linkvalue+"============> Not a Broken Link");
				nolink++;
			}
			
			}catch(Exception e)
			{}
				
		}
		
		System.out.println("No of Broken links are "+countlink);
		System.out.println("No of normal links are "+nolink);
		System.out.println("No of Broken links are "+emptylink);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
