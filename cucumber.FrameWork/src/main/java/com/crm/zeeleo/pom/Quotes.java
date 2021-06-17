package com.crm.zeeleo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quotes {
	
	
	public Quotes(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(xpath="//img[@title='Create Quote...']")
	private WebElement qouteIcon;
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement ScearchPro;
	
	@FindBy(xpath="//div[@id='basicsearchcolumns_real']/descendant::select[@id='bas_searchfield']")
	private WebElement ScearchProdrop;
	
	@FindBy(xpath="//input[@name='submit']")
	private WebElement ScearchProButton;

	public WebElement getquoteIcon() {
		return qouteIcon;
	}

	public WebElement getScearchPro() {
		return ScearchPro;
	}

	public WebElement getScearchProdrop() {
		return ScearchProdrop;
	}

	public WebElement getScearchProButton() {
		return ScearchProButton;
	}
	
	

}
