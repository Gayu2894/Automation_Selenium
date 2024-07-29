package Session1;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrtingDataInExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"//TestData//mfile.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Data");
		XSSFRow row1=sheet.createRow(0);
		   row1.createCell(0).setCellValue("Tech");
		   row1.createCell(1).setCellValue("version");
		   row1.createCell(2).setCellValue("Domain");
	    XSSFRow row2=sheet.createRow(1);
		   row2.createCell(0).setCellValue("Java");
		   row2.createCell(1).setCellValue("19");
		   row2.createCell(2).setCellValue("Automation");
		  
		   XSSFRow row3=sheet.createRow(2);
		   row3.createCell(0).setCellValue("Selenium");
		   row3.createCell(1).setCellValue("4.2");
		   row3.createCell(2).setCellValue("Automation");
		
		   XSSFRow row4=sheet.createRow(3);
		   row4.createCell(0).setCellValue("Python");
		   row4.createCell(1).setCellValue("3");
		   row4.createCell(2).setCellValue("Automation");
		
		   XSSFRow row5=sheet.createRow(4);
		   row5.createCell(0).setCellValue("C#");
		   row5.createCell(1).setCellValue("5");
		   row5.createCell(2).setCellValue("Automation");
		
		
		workbook.write(file);
		
		
		workbook.close();
		file.close();
		System.out.println("File is Created");
		
		
		
		
		
		
	}

}
