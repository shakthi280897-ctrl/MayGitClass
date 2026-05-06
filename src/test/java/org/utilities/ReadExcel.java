package org.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


//Excel File>>>> Workbook>>>>Sheets>>>>Rows>>>>Cell

public class ReadExcel {
	public static void main(String[] args) throws IOException {
		File f = new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\ExcelUtils\\src\\test\\resources\\testdata\\Facebook_TestCases.xlsx");

		FileInputStream file = new FileInputStream(f);

		Workbook workbook = new XSSFWorkbook(file);
		
		Sheet sheet = workbook.getSheet("Sheet2");
		
	    int totalRows = sheet.getLastRowNum();
	    
	    Row row = sheet.getRow(1);
	    
		int totalcells = sheet.getRow(1).getLastCellNum();
	    
	 System.out.println("number of rows - "+totalRows);
	 System.out.println("number of cells - "+totalcells);
	
	for(int i =1;i<=totalRows;i++) {
		
		Row row2 = sheet.getRow(i);
		
		for(int j=0;j<totalcells;j++) {
			 Cell cell = row2.getCell(j);
		
		            System.out.print(cell.toString() + "\t"); // same line
		   
		}
	 System.out.println(); // next row
	
	}

workbook.close();
file.close();

}

}
