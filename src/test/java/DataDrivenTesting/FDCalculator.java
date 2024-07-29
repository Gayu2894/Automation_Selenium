package DataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		String filepath= System.getProperty("user.dir")+"\\TestData\\DataCalulate.xlsx";
		int rows=ExcelUtils.getRowCount(filepath,"Sheet1");
		for(int i=1;i<rows;i++)
		{
			String Principle=ExcelUtils.getCellData(filepath, "Sheet1",i,0);
			String Interest =ExcelUtils.getCellData(filepath, "Sheet1",i,1);
			String period1=ExcelUtils.getCellData(filepath, "Sheet1",i,2);
			String period2=ExcelUtils.getCellData(filepath, "Sheet1",i,3);
			String frequency=ExcelUtils.getCellData(filepath, "Sheet1",i,4);
			String MVvalue=ExcelUtils.getCellData(filepath, "Sheet1",i,5);
			
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(Principle);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(Interest);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period1);
			Select val=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			val.selectByVisibleText(period2);
			Select val1=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			val1.selectByVisibleText(frequency);
			driver.findElement(By.xpath("//img[contains(@src,'btn_calcutate')]")).click();
			String ActMVval=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			//converting string to double value 
			if(Double.parseDouble(MVvalue)==Double.parseDouble(ActMVval))
			{
				System.out.println("TestCase Passed.....");
				ExcelUtils.setCellData(filepath,"Sheet1", i, 7, "Passed");
				ExcelUtils.fillGreenColor(filepath, "Sheet1", i, 7);
				
			}
			else
			{
				System.out.println("Testcase Failed");
				ExcelUtils.setCellData(filepath,"Sheet1", i, 7, "Failed");
				ExcelUtils.fillRedColor(filepath, "Sheet1", i, 7);
			}
			driver.findElement(By.xpath("//img[contains(@src,'btn_clear')]")).click();
			
			Thread.sleep(2000);
			
		}

		driver.quit();
	}

}
