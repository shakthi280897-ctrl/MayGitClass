package org.page;

import org.baseclass.Baseclass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Baseclass1 {
	@FindBy(name = "name")
	private WebElement userName;

	@FindBy(xpath = "(//input[@name='email'])[2]")
	private WebElement email;

	@FindBy(xpath = "//button[text()='Signup']")
	private WebElement sign;
	
	@FindBy(id="id_gender2")
	private WebElement gender;

    @FindBy(id = "password")
    WebElement password;
    
    @FindBy(id = "first_name")
    WebElement firstName;

    @FindBy(id = "last_name")
    WebElement lastName;

    @FindBy(id = "address1")
    WebElement address;

    @FindBy(id = "state")
    WebElement state;

    @FindBy(id = "city")
    WebElement city;

    @FindBy(id = "zipcode")
    WebElement zipcode;

    @FindBy(id = "mobile_number")
    WebElement mobile;

    @FindBy(xpath = "//button[text()='Create Account']")
    WebElement createAccountBtn;

    @FindBy(xpath = "//b[text()='Account Created!']")
    WebElement successMsg;
    
    @FindBy(xpath="//a[@data-qa='continue-button']")
    WebElement next;

		
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void login(String uname, String emai) {
		waitForElement(userName).sendKeys(uname);
		waitForElement(email).sendKeys(emai);
		waitAndClick(sign);
		//password.sendKeys("12345");
//		firstName.sendKeys("Shakthi");
//        lastName.sendKeys("Test");
//        address.sendKeys("Chennai");
//        state.sendKeys("Tamil Nadu");
//        city.sendKeys("Chennai");
//        zipcode.sendKeys("600001");
//        mobile.sendKeys("9876543210");
       
	}
	
	public void createAccount() {
        createAccountBtn.click();
    }

    public boolean isAccountCreated() {
        return successMsg.isDisplayed();
    }
    public void AccountPage() {
    	 next.click();
    }
    
}
