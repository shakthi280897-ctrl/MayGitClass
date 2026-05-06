package org.testrunner;

import org.baseclass.Baseclass1;
import org.page.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestRunner extends Baseclass1 {
	@Test(dataProvider="SampleData",dataProviderClass=DataSet.class)
	public void tc7 (String userName,String pass){
		Baseclass1 b=new Baseclass1();
		b.getBrowser("chrome");
		b.launchURL("https://automationexercise.com/login");		
		LoginPage l=new LoginPage();
		l.login(userName,pass);			
//		l.createAccount();
//		l.isAccountCreated();
//		
//		   if (l.isAccountCreated()) {
//	            System.out.println("Account Created Successfully ✅");
//	        } else {
//	            System.out.println("Failed ❌");
//	        }
//      l.AccountPage();
	}	
	//using Data Provider inside the class
	@DataProvider(name="SampleData")
	public Object[][] data(){
		return new Object[][] {
			{"abc","shdj@gmail.com"},
			{"sdf","hjhj@gmail.com"},
			{"yuyu","uiu@gmail.com"}
		};

	}
	


}
