package org.firsttestng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
WebDriver driver;

	@BeforeClass
	void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
	}
	
	@Test
	void testLogin()
	{
	LoginPage3 l=new LoginPage3(driver);
	l.getTitle();
	l.setUserName("Admin");
	l.setPassword("admin123");
	l.clickLogin();
	
	//Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}

	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
}
