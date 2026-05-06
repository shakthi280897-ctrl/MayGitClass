package org.utilities;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {

//	public static void getDataFromExcel() throws IOException {
//		File f = new File(
//				"C:\\Users\\Administrator\\eclipse-workspace\\ExcelUtils\\src\\test\\resources\\testdata\\Facebook_TestCases.xlsx");
//
//		FileInputStream file = new FileInputStream(f);
//
//		Workbook workbook = new XSSFWorkbook(file);
//
//		Sheet sheet = workbook.getSheet("Sheet1");
//		
//		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
//				for(int i=0;i<physicalNumberOfRows;i++) {
//					Row row = sheet.getRow(i);
//					
//					for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
//						Cell cell = row.getCell(j);
//						String stringCellValue = cell.toString();
//						System.out.println(stringCellValue);
//					}
//				}
//			
//	}
//	
	public void readData() throws IOException {	
			File f = new File("C:\\Users\\Administrator\\eclipse-workspace\\ExcelUtils\\src\\test\\resources\\testdata\\Facebook_TestCases.xlsx");

			FileInputStream file = new FileInputStream(f);
			Workbook workbook = new XSSFWorkbook(file);
			Sheet sheet = workbook.getSheet("Sheet2");			
			System.out.println("Switch Method");
			Row row = sheet.getRow(11);
			Cell cell = row.getCell(9);	

			
			 switch (cell.getCellType()) {
		        case STRING:
		            System.out.println("String Value: " + cell.getStringCellValue());
		            break;
		        case NUMERIC:
		            if (DateUtil.isCellDateFormatted(cell)) {
		                System.out.println("Date Value: " + cell.getDateCellValue());
		            } else {
		                System.out.println("Numeric Value: " + cell.getNumericCellValue());
		            }
		            break;
		        case BOOLEAN:
		            System.out.println("Boolean Value: " + cell.getBooleanCellValue());
		            break;
		        case BLANK:
		            System.out.println("Blank Cell");
		            break;
		        default:
		            System.out.println("Other Type");
		        }
	}
	

//	private void WriteData() throws IOException {
//		File f = new File(
//				"C:\\Users\\Administrator\\eclipse-workspace\\ExcelUtils\\src\\test\\resources\\testdata\\Facebook_TestCases.xlsx");
//
//		FileInputStream file = new FileInputStream(f);
//		Workbook workbook = new XSSFWorkbook(file);
//		Sheet sheet = workbook.getSheet("Sheet2");
//		if (sheet == null) {
//			sheet = workbook.createSheet("Sheet2");
//		} else {
//			System.out.println("Sheet already created");
//		}
//
//		Row row = sheet.getRow(1);
//		if (row == null) {
//			row = sheet.createRow(1);
//		}
//		Cell cell = row.getCell(1);
//		if (cell == null) {
//			cell = row.getCell(1);
//		}
//		cell.setCellValue("Sharmila devi");
//
//		FileOutputStream out = new FileOutputStream(f);
//		workbook.write(out);
//		out.close();
//		System.out.println("Data Created Successfully");
//
//	}

	public static void main(String[] args) throws IOException {
		ExcelUtilities e = new ExcelUtilities();
		e.readData();
		
	}
}
