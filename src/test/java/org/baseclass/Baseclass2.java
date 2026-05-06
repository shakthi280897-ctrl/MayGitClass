package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass2 {
	  public static WebDriver driver;

	    // Launch Edge Browser
	    public static void chromeBrowser() {
	     WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }

	    // Maximize Window
	    public static void maxWindow() {
	        driver.manage().window().maximize();
	    }

	    // Launch URL
	    public static void launchUrl(String url) {
	        driver.get(url);
	    }

	    // Get Title
	    public static void pageTitle() {
	        String title = driver.getTitle();
	        System.out.println("Page Title: " + title);
	    }

	    // Get Current URL
	    public static  void pageUrl() {
	        String url = driver.getCurrentUrl();
	        System.out.println("Page URL: " + url);
	    }

	    // Close Browser
	    public static void closeBrowser() {
	        driver.quit();
	    }

	    // Send Keys
	    public static void fillTextBox(WebElement element, String value) {
	        element.sendKeys(value);
	    }

	    // Click
	    public static void buttonClick(WebElement element) {
	        element.click();
	    }

	    // Double Click
	    public static void doubleClick(WebElement element) {
	        Actions a = new Actions(driver);
	        a.doubleClick(element).perform();
	    }

	    // Right Click
	    public static void rightClick(WebElement element) {
	        Actions a = new Actions(driver);
	        a.contextClick(element).perform();
	    }

	    // Copy (CTRL + C)
	    public static void copy() throws AWTException {
	        Robot r = new Robot();
	        r.keyPress(KeyEvent.VK_CONTROL);
	        r.keyPress(KeyEvent.VK_C);
	        r.keyRelease(KeyEvent.VK_C);
	        r.keyRelease(KeyEvent.VK_CONTROL);
	    }

	    // Paste (CTRL + V)
	    public static void paste() throws AWTException {
	        Robot r = new Robot();
	        r.keyPress(KeyEvent.VK_CONTROL);
	        r.keyPress(KeyEvent.VK_V);
	        r.keyRelease(KeyEvent.VK_V);
	        r.keyRelease(KeyEvent.VK_CONTROL);
	    }
	}