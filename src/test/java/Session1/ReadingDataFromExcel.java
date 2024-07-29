package Session1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {
	// workbook--sheet--row---cell

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//TestData//TestData.xlsx");
		XSSFWorkbook Workbook =new XSSFWorkbook(file);
		XSSFSheet sheet=Workbook.getSheet("Sheet1"); // getsheetAt(index)
        int rows = sheet.getLastRowNum();
		System.out.println("Total no of Rows: "+ rows);//5 starting index 0 
		int columns= sheet.getRow(1).getLastCellNum();
		System.out.println("Total no of Rows: "+ columns);//4 starting index 1
		
		for(int r=0;r<=rows;r++) //Starting index 0 
		{
			XSSFRow currentRow=sheet.getRow(r);
			for(int c=0;c<columns;c++) //Starting index 0 in java 
		    {
				XSSFCell values=currentRow.getCell(c);
				System.out.print(values.toString()+"\t\t");
			}
			System.out.println();
		}
		
		Workbook.close();
		file.close();
		
		
		
		
	}

}
