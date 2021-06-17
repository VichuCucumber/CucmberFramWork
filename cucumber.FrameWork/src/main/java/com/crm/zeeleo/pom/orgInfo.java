package com.crm.zeeleo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orgInfo {
	
	
	
	public orgInfo(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement SuccrssfullMasg;

	public WebElement getSuccrssfullMasg() {
		return SuccrssfullMasg;
	}
	
	
	
	
}
