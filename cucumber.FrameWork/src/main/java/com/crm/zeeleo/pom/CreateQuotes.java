package com.crm.zeeleo.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonlib.Base_Test;
import cucumberCommonGeneric.Base;

public class CreateQuotes extends Base {
	
	public CreateQuotes(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='subject']")
	private WebElement quotesName;
	
	@FindBy(xpath="//input[@name='account_name']/following-sibling::img[@src='themes/softed/images/select.gif']")
	private WebElement  orgLookUp;
	
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement  BillingAdd;
	
	@FindBy(xpath="//textarea[@name='ship_street']")
	private WebElement  shipingAdd;
	
	@FindBy(xpath="//img[@id='searchIcon1']")
	private WebElement  proLookUp;
	
	@FindBy(xpath="//input[@name='qty1']")
	private WebElement qyt;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement  saveButton;
	
	
	
	
	
	public WebElement getQyt() {
		return qyt;
	}





	public WebElement getQuotesName() {
		return quotesName;
	}





	public WebElement getOrgLookUp() {
		return orgLookUp;
	}





	public WebElement getBillingAdd() {
		return BillingAdd;
	}





	public WebElement getShipingAdd() {
		return shipingAdd;
	}





	public WebElement getProLookUp() {
		return proLookUp;
	}





	public WebElement getSaveButton() {
		return saveButton;
	}





	public void CreateQuote(String QouteName,String orgName,String BillAdd, String ShipAdd,String proName,String qty){
		
		wLib.waitForpageload(driver, 10);
		//create new quotes
		quotesName.sendKeys(QouteName);
		orgLookUp.click();
		//switch to org
		wLib.SwitchWin(driver, "Accounts");
		OrgPage op = new OrgPage(driver);
		op.getSearchOrg().sendKeys(orgName);
		op.getSearchButton().click();
		wLib.WaitForVisisbleDElement(driver, 10, driver.findElement(By.xpath("//a[text()='"+orgName+"']")));
		 driver.findElement(By.xpath("//a[text()='"+orgName+"']")).click();
		 wLib.AlertCancle(driver);
		
		//switch back to Quotes
		wLib.SwitchWin(driver, "Quotes");
		BillingAdd.sendKeys(BillAdd);
		shipingAdd.sendKeys(ShipAdd);
		proLookUp.click();
		//switch to product
		wLib.SwitchWin(driver, "Product");
		ProductPage proPage = new ProductPage(driver);
		proPage.getScearchPro().sendKeys(proName);
		proPage.getScearchProButton().click();
		wLib.WaitForVisisbleDElement(driver, 10, driver.findElement(By.xpath("//a[text()='"+proName+"']")));
		driver.findElement(By.xpath("//a[text()='"+proName+"']")).click();
	    //switch back to quotes
		wLib.SwitchWin(driver, "Quotes");
		qyt.sendKeys(qty);
		
		saveButton.click();
		
		
		
		
	}
	
	
	
	

}
