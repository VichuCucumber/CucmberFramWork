package com.crm.zeeleo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonlib.Base_Test;
import cucumberCommonGeneric.Base;

public class homePage extends Base{
	
	public homePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement org;
	
	@FindBy(linkText="More")
	private WebElement more;
	
	@FindBy(xpath="//a[text()='Products']")
	private WebElement product;
	
	@FindBy(xpath="//a[@name='Quotes']")
	private WebElement qoutes;
	
	@FindBy (linkText="Sign Out")
	private WebElement signOut;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement SignOutIcon;
	
	@FindBy(xpath="//img[@src='themes/softed/images/Home.PNG']")
	private WebElement HomePageIcon;


	public WebElement getHomePageIcon() {
		return HomePageIcon;
	}

	public WebElement getOrg() {
		return org;
	}

	public WebElement getMore() {
		return more;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getQoutes() {
		return qoutes;
	}

	public WebElement getSignOut() {
		return signOut;
	}

	public WebElement getSignOutIcon() {
		return SignOutIcon;
	}
	
	public void LogOut() throws Throwable{
		
		HomePageIcon.click();
		SignOutIcon.click();
		Thread.sleep(5000);
		///wLib.WaitForVisisbleDElement(driver, 10, signOut);
		signOut.click();
		
	}

}
