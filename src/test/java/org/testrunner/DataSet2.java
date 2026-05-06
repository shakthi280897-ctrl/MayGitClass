package org.testrunner;

import org.testng.annotations.DataProvider;
import org.utilities.ExcelUtil;
import org.utilities.ExcelUtilities;
import org.utilities.ExcelUtils;
public class DataSet2 {
	@DataProvider(name = "excelData")
	public Object[][] getExcelData() throws Exception {
		String path = "C:\\Users\\Administrator\\eclipse-workspace\\ExcelUtils\\src\\test\\resources\\testdata\\Facebook_TestCases.xlsx";
		return ExcelUtil.getData(path, "Sheet2");
	}
}
