package stepDefanetions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.crm.zeeleo.pom.LoginPage;
import com.crm.zeeleo.pom.homePage;

import commonlib.ExcelUtility;
import commonlib.Iconnstant;
import commonlib.javaUtility;
import commonlib.proUtility;
import commonlib.webDriverUtility;
import cucumberCommonGeneric.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Base_Class {
	public static WebDriver driver;
	public proUtility pLib = new proUtility();
	public ExcelUtility eLib = new ExcelUtility();
	public webDriverUtility wLib = new webDriverUtility();
	public javaUtility jLib = new javaUtility();
	
	@Before("@RegTest")
	public void Openbrowser() throws Throwable{
		    driver = Base.getDriver();
	 		
	 		System.out.println("======open the browser=========");
	 		String userName = pLib.getProValue(Iconnstant.proPath, "username");
			String password = pLib.getProValue(Iconnstant.proPath, "password");
			String url = pLib.getProValue(Iconnstant.proPath, "url");
			
	        
			 driver.get(url);
			 wLib.waitForpageload(driver, 10);
			 LoginPage lp = new LoginPage(driver);
			 lp.Loigin(userName, password);
			
			
			System.out.println("======login=========");
	}
	
	@After("@RegTest")
	public void closeBrowser() throws Throwable{
		homePage hp = new homePage(driver);
		hp.getHomePageIcon().click();
		hp.LogOut();
		System.out.println("=====logout=============");
		driver.quit();
		System.out.println("=======close the browser======");
	}

}
