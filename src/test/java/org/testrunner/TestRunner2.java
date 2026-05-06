package org.testrunner;

import org.baseclass.Baseclass2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestRunner2 extends Baseclass2 {
	public static void main(String[] args) {

		chromeBrowser();
		maxWindow();

		launchUrl("https://www.facebook.com");

		pageTitle();
		pageUrl();
		WebElement email = driver.findElement(By.id("_R_oiqjbjb9pb6amH1_"));
		fillTextBox(email, "fgfgfg");

		closeBrowser();
	}
}