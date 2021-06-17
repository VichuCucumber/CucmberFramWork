package commonlib;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.crm.zeeleo.pom.LoginPage;
import com.crm.zeeleo.pom.homePage;

public class Base_Test implements Iconnstant {
	
	
	public static WebDriver driver;
	public proUtility pLib = new proUtility();
	public ExcelUtility eLib = new ExcelUtility();
	public webDriverUtility wLib = new webDriverUtility();
	public javaUtility jLib = new javaUtility();
	
	
	
	@BeforeSuite
	public void OpenDB(){
		System.out.println("======open the DB=========");
	}
	
	@BeforeTest
	public void OpenTest(){
		System.out.println("======open test=========");
	}
	@BeforeClass
	public void OpenBrowser() throws Throwable{
		 String Browser = pLib.getProValue(Iconnstant.proPath, "browser");
	 		
	 		
	 		if(Browser.equalsIgnoreCase("chrome")){
	 			driver = new ChromeDriver();
	 		}else if (Browser.equalsIgnoreCase("firefox")){
	 			driver = new FirefoxDriver();
	 		}else if(Browser.equalsIgnoreCase("IE")){
	 			driver = new InternetExplorerDriver();
	 		}
	 		
	 		System.out.println("======open the browser=========");
		
	}
	@BeforeMethod
	public void Login() throws Throwable{
		
		String userName = pLib.getProValue(proPath, "username");
		String password = pLib.getProValue(proPath, "password");
		String url = pLib.getProValue(proPath, "url");
		
        
		 driver.get(url);
		 wLib.waitForpageload(driver, 10);
		 LoginPage lp = new LoginPage(driver);
		 lp.Loigin(userName, password);
		
		
		System.out.println("======login=========");
	}
	@AfterMethod
	public void LogOut() throws Throwable{
		homePage hp = new homePage(driver);
		hp.LogOut();
		System.out.println("=====logout=============");
		
	}
	
	@AfterClass
	public void CloseBrowser(){
		driver.quit();
		System.out.println("=======close the browser======");
	}
	
	@AfterTest
	public void Close_the_test(){
		System.out.println("=====close the test");
	}
	
	@AfterSuite
	public void CloseDB(){
		System.out.println("====close db========");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
