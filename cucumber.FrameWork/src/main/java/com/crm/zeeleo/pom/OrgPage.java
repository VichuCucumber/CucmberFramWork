package com.crm.zeeleo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgPage {
	 
	public OrgPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@title='Create Organization...']") 
	private WebElement orgIcon;
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchOrg;
	
	@FindBy(xpath="//div[@id='basicsearchcolumns_real']/descendant::select[@id='bas_searchfield']")
	private WebElement searchDrp;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement SearchButton;

	public WebElement getOrgIcon() {
		return orgIcon;
	}

	public WebElement getSearchOrg() {
		return searchOrg;
	}

	public WebElement getSearchDrp() {
		return searchDrp;
	}

	public WebElement getSearchButton() {
		return SearchButton;
	}
	
	
	
	

}
