package com.crm.zeeleo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productInfo {
	
	public productInfo(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//span[@class='lvtHeaderText']")
	private WebElement SuccessFullMasg;


	public WebElement getSuccessFullMasg() {
		return SuccessFullMasg;
	}
	
	

}
