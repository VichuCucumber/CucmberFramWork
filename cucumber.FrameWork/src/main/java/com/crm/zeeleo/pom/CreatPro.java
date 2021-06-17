package com.crm.zeeleo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonlib.Base_Test;

public class CreatPro extends Base_Test {
	
	public CreatPro(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@name='productname']")
	private WebElement proName;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	@FindBy(xpath="//input[@id='unit_price']")
	private WebElement unitPrice;

	public WebElement getProName() {
		return proName;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getUnitPrice() {
		return unitPrice;
	}
	
	public void createProduct(String proName,String UnitPrice){
		
		wLib.waitForpageload(driver, 10);
		getProName().sendKeys(proName);
		getUnitPrice().sendKeys(UnitPrice);
		getSaveBtn().click();
		
		
	}

}
