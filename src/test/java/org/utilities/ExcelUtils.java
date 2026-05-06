package org.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static void main(String[] args) throws IOException {

		File f = new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\ExcelUtils\\src\\test\\resources\\testdata\\Facebook_TestCases.xlsx");

		FileInputStream file = new FileInputStream(f);

		Workbook workbook = new XSSFWorkbook(file);

		Sheet sheet = workbook.getSheet("Sheet2");

		int totalRows = sheet.getLastRowNum();
		short totalCells = sheet.getRow(1).getLastCellNum();

		System.out.println("number of Rows -" + totalRows);
		System.out.println("number of cells -" + totalCells);

		for (int r = 0; r <= totalRows; r++) {
			Row currentRow = sheet.getRow(r);
			for (int c = 0; c < totalCells; c++) {
				Cell cell = currentRow.getCell(c);
				System.out.println(cell.toString()+"\t");
			}
		}

	}
	

}