package org.testrunner;

import org.baseclass.Baseclass1;
import org.page.LoginPage;
import org.testng.annotations.Test;

public class TestRunnerrr  extends Baseclass1  {
	
	
	@Test(dataProvider = "excelData", dataProviderClass = DataSet2.class)
	public void tc7(String username,String password,String data) {

	    System.out.println(username);
	    System.out.println(password);
	    System.out.println(data);
	}

}
