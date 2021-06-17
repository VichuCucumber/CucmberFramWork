package com.crm.zeeleo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumberCommonGeneric.Base;

public class QuotesInfo extends Base {
	public QuotesInfo(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
     
	@FindBy(xpath="//span[@class='lvtHeaderText']")
	private WebElement SucssfulMasg;

	public WebElement getSucssfulMasg() {
		return SucssfulMasg;
	}
	
	public String GetSucccessFullmasg(){
		String value = SucssfulMasg.getText();
		return value;
		
	}
	
}

