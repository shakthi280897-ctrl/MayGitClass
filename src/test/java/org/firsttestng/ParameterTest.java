package org.firsttestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterTest {

	WebDriver driver;

	@BeforeClass
	@Parameters({ "browser" })
	void setup(String br) throws InterruptedException {

		switch (br.toLowerCase()) {
		case "chrome":
		    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "edge":
		    WebDriverManager.edgedriver().setup();
			 WebDriverManager.edgedriver().setup();  
		      driver = new EdgeDriver();
			break;

		case "firefox":
		    WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Invalid browser");
			return;

		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	void testLogo() {

		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
		System.out.println(status);

	}

	@Test(priority = 2)
	void testTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		System.out.println(title);

	}

	@Test(priority = 3)
	void testUrl() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(currentUrl);
	}

	@AfterClass
	void tearDown() {
		driver.quit();
	}
	

}
