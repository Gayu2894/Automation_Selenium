package Session1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		///Single file uploaded
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\harsh\\eclipse-workspace\\Test3.txt");
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Test3.txt"))
		System.out.println("File is uploaded successfully");
		else
			System.out.println("File not uploaded ");
		
		//Multiple file uploaded
		String file1="C:\\Users\\harsh\\eclipse-workspace\\Test1.txt";
	    String file2="C:\\Users\\harsh\\eclipse-workspace\\Test2.txt";
	    driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
	    int count=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
	    if(count==3)
	    	System.out.println("Total Three Files present");
	    else
	    	System.out.println("Files not uploaded properly");
	    
	    List<WebElement> filename=driver.findElements(By.xpath("//ul[@id='fileList']//li"));
	    for(int i=0;i<count;i++)
	    {
	    	if(filename.get(1).getText().equalsIgnoreCase("test1.txt")&&filename.get(2).getText().equalsIgnoreCase("test2.txt"))
	        System.out.println("Multiple files uploaded");
	        else
	        	System.out.println("Files not available");
	        break;
	    }
	    /*for(WebElement fn:filename)
	    {
	    	if(fn.getText().equals("Test1.txt")&&fn.getText().equals("Test2.txt"))
	    		 System.out.println("Multiple files uploaded successfully");
	    	 else
	     		System.out.println("Files not Uploaded p");
	 	   break;
	    }
	   */
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
