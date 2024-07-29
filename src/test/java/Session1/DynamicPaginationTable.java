package Session1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement> totalPages=driver.findElements(By.xpath("//ul[@id='pagination']//li"));
	    System.out.println("Total Pages are  "+totalPages.size());
	    List<WebElement> rows=driver.findElements(By.xpath("//table[@id='productTable']//tr"));
	    System.out.println("Rows are  "+rows.size());
	    List<WebElement> Columns=driver.findElements(By.xpath("//table[@id='productTable']//th"));
	    System.out.println("Columns are  "+Columns.size());
	  
	    System.out.println("Id"+"\t"+"Name"+"\t\t"+"Price");
	    for(int p=1;p<=totalPages.size();p++)
	    {
	    	if(p>1)
	    	{
	    		driver.findElement(By.xpath("//li//a[contains(text(),"+p+")]")).click();
	    	}
	    	
	    	//for reading data
	    	for(int r=1;r<rows.size();r++)
	    	{
	    		
	    		for(int c=1;c<=Columns.size();c++)
	    		{
	    			String values=driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td["+c+"]")).getText();
	    			System.out.print(values+"\t");
	    		}
	    		driver.findElement(By.xpath("//tr["+r+"]//td[4]//input[@type='checkbox']")).click();
	    		System.out.println();
	    	}
	    	
	    }
	 	
	}
}
