package org.testrunner;

import org.testng.annotations.DataProvider;
import org.utilities.ExcelUtil;

public class DataSet {
	
	@DataProvider(name="SampleData")
	public Object[][] data(){
return new Object[][] {
	
			{"abc","shdj@gmail.com"},
			{"sdf","hjhj@gmail.com"},
			{"yuyu","uiu@gmail.com"}
		};

	}

}
