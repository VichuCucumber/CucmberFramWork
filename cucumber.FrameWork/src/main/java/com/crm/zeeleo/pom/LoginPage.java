package com.crm.zeeleo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonlib.Base_Test;
import commonlib.webDriverUtility;

public class LoginPage   {
	
	
	WebDriver driver;
	webDriverUtility wLib = new webDriverUtility();
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='user_name']") 
	private WebElement Username;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement password;
	
	@FindBy(xpath= "//input[@id='submitButton']")
	private WebElement LoginButton;

	public WebElement getUsername() {
		return Username;
	}

	public void setUsername(WebElement username) {
		Username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public void setLpginButton(WebElement lpginButton) {
		LoginButton = lpginButton;
	}
	
	public void Loigin(String userNameed,String passWord){
		//wLib.waitForpageload(driver, 10);
		Username.sendKeys(userNameed);
		password.sendKeys(passWord);
		LoginButton.click();
		
		
	}

}
