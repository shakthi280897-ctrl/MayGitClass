package org.stepdefff;
import org.baseclass.Baseclass2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef {
    Baseclass2 b = new Baseclass2();

    @Given("User is on login page")
    public void user_is_on_login_page() {
        b.chromeBrowser();
        b.maxWindow();
        b.launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("User enters {string} and {string}")
    public void user_enters_credentials(String username, String password) {

        WebElement user = Baseclass2.driver.findElement(By.xpath("//input[@name='username']"));
        WebElement pass = Baseclass2.driver.findElement(By.xpath("//input[@type='password']"));

        b.fillTextBox(user, username);
        b.fillTextBox(pass, password);
    }

    @When("Click Login")
    public void click_login() {
        WebElement loginBtn = Baseclass2.driver.findElement(By.xpath("//button[@type='submit']"));
        b.buttonClick(loginBtn);
    }

    @Then("Close Browser")
    public void close_browser() {
        WebElement dashboard = Baseclass2.driver.findElement(By.xpath("//h6[text()='Dashboard']"));

        // Assertion
        Assert.assertTrue(dashboard.isDisplayed(), "Login Failed!");
        b.closeBrowser();
    }
}

