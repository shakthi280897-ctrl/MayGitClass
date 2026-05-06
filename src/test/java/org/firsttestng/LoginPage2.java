package org.firsttestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage2 {
	WebDriver driver;
	// Constructor - will initialize the Driver
	LoginPage2(WebDriver driver) {
		this.driver = driver;
	}
	// Locators
	By txt_username_loc = By.xpath("//input[@placeholder='Username']");
	By txt_password_loc = By.xpath("//input[@placeholder='Password']");
	By btn_login_loc = By.xpath("//button[normalize-space()='Login']");

	// Action Methods
	public void setUserName(String user)
	{
		driver.findElement(txt_username_loc).sendKeys(user);
	}

	public void setPassword(String pwd)
	{
		driver.findElement(txt_password_loc).sendKeys("36456");

	}
	public void clickLogin()
	{
		driver.findElement(btn_login_loc).click();

	}
	public void getTitle()
	{
		String title = driver.getTitle();
		System.out.println(title);

	}
}
