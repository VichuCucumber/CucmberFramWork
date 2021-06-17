package com.crm.zeeleo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonlib.Base_Test;

public class CreateOrg extends Base_Test{
	
	public CreateOrg(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement OrgName;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement SaveButton;

	public WebElement getOrgName() {
		return OrgName;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}
	
	public void CreateOrganization(String orgName,WebElement element,String VisibleText){
		
		wLib.waitForpageload(driver, 10);
		getOrgName().sendKeys(orgName);
		wLib.Select(element, VisibleText);
		getSaveButton().click();
	}
	public void Createorganization(String orgName){
		wLib.waitForpageload(driver, 10);
		getOrgName().sendKeys(orgName);
		getSaveButton().click();
	}
	
	
	
	

}
