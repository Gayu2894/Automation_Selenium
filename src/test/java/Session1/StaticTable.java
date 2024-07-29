package Session1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
  
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//find total number of rows in a table
		List<WebElement> rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		System.out.println("Number of rows: "+rows.size());
       /* for(int i=0;i<rows.size();i++)
        {
        	System.out.println(rows.get(i).getText());
        }*/
      
       //  List<WebElement> column1=driver.findElements(By.tagName("th"));
        // System.out.println("Number of rows: "+column1.size());
       
        //find total number of column in a table
      		List<WebElement> column=driver.findElements(By.xpath("//table[@name='BookTable']//th"));
      		System.out.println("Number of column: "+column.size());
              /*for(int i=0;i<column.size();i++)
              {
              	System.out.println(column.get(i).getText());
              }
              */
           //To capture the data from specific row and column(ex :5th row and 1st column:   
            WebElement BookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]"));
            System.out.println("BookName is: "+BookName.getText());
            
            System.out.println();
            
            
            //Header is tagged with <th>so header given separately
            System.out.println("BookName"+"\t\t"+"Author"+"\t\t"+"Subject"+"\t\t"+"Price");
           //To print all values in Tabular form
            for(int r=2;r<=rows.size();r++)
            {
            	for(int c=1;c<=column.size();c++)
            	{
            		String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
            		System.out.print(value+"\t\t");
            	}
            	System.out.println();
            }
            
           
            //To Print only the Author name
            System.out.println("Mukesh Author Books are ");
            for(int r=2;r<=rows.size();r++)
            {
            	String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
        		//System.out.println(value);
        		if(value.equalsIgnoreCase("mukesh"))
        		{
        			String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
        			System.out.println(data+"\t\t "+value);
        		}
            	
            }
            
            //To calculate the Total price of the books
            int total=0;
            for(int r=2;r<=rows.size();r++)
            {
            	String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
            	//System.out.println(price);
            	
            	 total=total+Integer.parseInt(price);
             }
            System.out.println("Total prices of books: "+total);
        
            
            
            
            
            
            
            
	}

}
