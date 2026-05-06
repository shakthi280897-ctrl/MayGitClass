package org.baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass1 {
	// Thread-safe driver
		private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

		public static WebDriver getDriver() {
			return driver.get();
		}

		// ===========================
		// Browser Setup
		// ===========================
		public void getBrowser(String browserType) {

			switch (browserType.toLowerCase()) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver.set(new ChromeDriver());
				break;

			case "edge":
				WebDriverManager.edgedriver().setup();
				driver.set(new EdgeDriver());
				break;

			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver.set(new FirefoxDriver());
				break;

			default:
				throw new RuntimeException("Invalid browser: " + browserType);
			}

			getDriver().manage().window().maximize();
			getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

		public static void launchURL(String url) {
			getDriver().get(url);
		}

		public void closeBrowser() {
			getDriver().quit();
			driver.remove();
		}

		// ===========================
		// Basic Actions
		// ===========================
		public void sendKeys(WebElement element, String value) {
			element.clear();
			element.sendKeys(value);
		}

		public void click(WebElement element) {
			element.click();
		}

		public String getText(WebElement element) {
			return element.getText();
		}

		public void clear(WebElement element) {
			element.clear();
		}

		// ===========================
		// Waits
		// ===========================
		public WebElement waitForElement(WebElement element) {
			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
			return wait.until(ExpectedConditions.visibilityOf(element));
		}

		public void waitAndClick(WebElement element) {
			waitForElement(element).click();
		}

		// ===========================
		// JavaScript Executor
		// ===========================
		public void sendKeysByJS(WebElement element, String value) {
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("arguments[0].value='" + value + "'", element);
		}

		public void clickByJS(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("arguments[0].click()", element);
		}

		// ===========================
		// Navigation
		// ===========================
		public void navigate(String action) {
			switch (action.toLowerCase()) {
			case "refresh":
				getDriver().navigate().refresh();
				break;
			case "forward":
				getDriver().navigate().forward();
				break;
			case "back":
				getDriver().navigate().back();
				break;
			}
		}

		// ===========================
		// Alert Handling
		// ===========================
		public void handleAlert(String action) {
			Alert alert = getDriver().switchTo().alert();

			if (action.equalsIgnoreCase("accept")) {
				alert.accept();
			} else if (action.equalsIgnoreCase("dismiss")) {
				alert.dismiss();
			}
		}

		// ===========================
		// Dropdown
		// ===========================
		public void selectByText(WebElement element, String text) {
			new Select(element).selectByVisibleText(text);
		}

		public void selectByValue(WebElement element, String value) {
			new Select(element).selectByValue(value);
		}

		public void selectByIndex(WebElement element, int index) {
			new Select(element).selectByIndex(index);
		}

		// ===========================
		// Actions
		// ===========================
		public void mouseHover(WebElement element) {
			new Actions(getDriver()).moveToElement(element).perform();
		}

		public void dragAndDrop(WebElement src, WebElement target) {
			new Actions(getDriver()).dragAndDrop(src, target).perform();
		}

		public void rightClick(WebElement element) {
			new Actions(getDriver()).contextClick(element).perform();
		}

		public void doubleClick(WebElement element) {
			new Actions(getDriver()).doubleClick(element).perform();
		}

		// ===========================
		// Screenshot
		// ===========================
		public String takeScreenshot(String name) {

			File src = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
			String path = System.getProperty("user.dir") + "/screenshots/" + name + "_" + System.currentTimeMillis()
					+ ".png";

			try {
				FileUtils.copyFile(src, new File(path));
			} catch (IOException e) {
				throw new RuntimeException("Screenshot failed");
			}

			return path;
		}

		// ===========================
		// Window Handling
		// ===========================
		public void switchToWindow(int index) {
			List<String> windows = new ArrayList<>(getDriver().getWindowHandles());
			getDriver().switchTo().window(windows.get(index));
		}

	}