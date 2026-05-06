package org.step;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefifnition {
	WebDriver driver;
	@Given("User is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	@When("User enters username and password")
	public void user_enters_username_and_password() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	}
	@When("Click Login")
	public void click_login() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	@Then("User should see homepage")
	public void user_should_see_homepage() {
		 String currentUrl = driver.getCurrentUrl();
		    if(currentUrl.contains("dashboard")) {
		        System.out.println("Login successful");
		    } else {
		        System.out.println("Login failed");
		    }
		    driver.quit();
	}
}
