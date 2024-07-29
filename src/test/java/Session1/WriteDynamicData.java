package Session1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDynamicData {

	public static void main(String[] args) throws IOException {
		
		
		
FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"//TestData//DynamicData.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("DynamicData");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many rows?");
		int rows=sc.nextInt();
		System.out.println("Enter how many columns?");
		int columns=sc.nextInt();
		
		for(int r=0;r<=rows;r++)
		{
			XSSFRow rowvalue=sheet.createRow(r);
			for(int c=0;c<=columns;c++)
			
			{
				rowvalue.createCell(c).setCellValue(sc.next());
			}
		}
	
		workbook.write(file);
		
		
		workbook.close();
		file.close();
		System.out.println("File is Created");
	}

}
