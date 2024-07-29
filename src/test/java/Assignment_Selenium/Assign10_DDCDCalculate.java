package Assignment_Selenium;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import DataDrivenTesting.ExcelUtils;

public class Assign10_DDCDCalculate {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		driver.manage().window().maximize();
		try {
		String file=System.getProperty("user.dir")+"\\TestData\\CDCalculate.xlsx";
		int rows=ExcelUtils.getRowCount(file,"Sheet1");
	
		System.out.println(rows);
		for(int i=1;i<rows;i++)
		{
			String initDepo=ExcelUtils.getCellData(file,"Sheet1",i,0);
			String lengthMon=ExcelUtils.getCellData(file,"Sheet1",i,1);
			String IntRate=ExcelUtils.getCellData(file,"Sheet1",i,2);
			String Compound=ExcelUtils.getCellData(file,"Sheet1",i,3);
			String Total=ExcelUtils.getCellData(file,"Sheet1",i,4);
			driver.findElement(By.xpath("//input[@id='mat-input-0']")).clear();
			driver.findElement(By.xpath("//input[@id='mat-input-1']")).clear();
			driver.findElement(By.xpath("//input[@id='mat-input-2']")).clear();
			driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(initDepo);
			driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(lengthMon);
			driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys(IntRate);
			List<WebElement> complist=driver.findElements(By.xpath("//div//mat-option//span[@class='mat-option-text']"));
			for(WebElement e:complist)
			{
				if(e.getText().equals(Compound))
				{
					e.click();
				}
			}
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			String TValue=driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();
			//System.out.println(TValue);
			
			if(Total.equals(TValue))
			{
				System.out.println("Test Passed");
				ExcelUtils.setCellData(file,"Sheet1",i,6,"Passed");
				ExcelUtils.fillGreenColor(file,"Sheet1",i,6);
			}
			else
			{
				System.out.println("Test Failed");
				ExcelUtils.setCellData(file,"Sheet1",i,6,"Failed");
				ExcelUtils.fillRedColor(file,"Sheet1",i,6);
			}
			
			Thread.sleep(2000);
		}
		driver.quit();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
