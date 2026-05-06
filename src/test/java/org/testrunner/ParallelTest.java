package org.testrunner;

import org.baseclass.Baseclass1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {
	WebDriver driver;
	   Baseclass1 b;
	@Parameters({"browser"})
	@Test
	 public void tc1(String browser) {

      Baseclass1 b=new Baseclass1();
      
      if(browser.equals("chrome")||browser.equals("firefox")
    		  ||browser.equals("edge")) 
     {
    	  b.getBrowser(browser);
    	  b.launchURL("https://www.facebook.com/");
    	
      }
    }
	
	 
	@AfterClass
	public void tr2() {
		b.closeBrowser();
	}
	  
}