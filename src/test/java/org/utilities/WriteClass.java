package org.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteClass {

	public static void main(String[] args) throws IOException {

		File f = new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\ExcelUtils\\src\\test\\resources\\testdata\\myfile.xlsx");

		FileOutputStream file = new FileOutputStream(f);

		Workbook workbook = new XSSFWorkbook();

		Sheet sheet = workbook.createSheet("Data");

		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("Welcome");
		row.createCell(1).setCellValue(123);
		row.createCell(2).setCellValue("Automation");

		Row row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Python");
		row2.createCell(1).setCellValue(3);
		row2.createCell(2).setCellValue("2344");

		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is created");
	}

}
