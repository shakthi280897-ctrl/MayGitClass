package org.firsttestng;

import org.testng.annotations.Test;
import java.time.Duration;
//open app
//test logo
//login
//close

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OraneHRMTest {
public static	WebDriver driver;

	@Test(priority=1)
	public void openapp() {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); // ✅ FIXED
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
	}

	@Test(priority=2)
	public void testlogo() throws InterruptedException {
		Thread.sleep(2000);
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("logo displayed " + status);
	}

	@Test(priority=3)
	public	void testLogin() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath(" //input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath(" //button[normalize-space()='Login']")).click();
	}

	@Test(priority=4)
	public void closeApp() {
		
            driver.quit();
	}

}
