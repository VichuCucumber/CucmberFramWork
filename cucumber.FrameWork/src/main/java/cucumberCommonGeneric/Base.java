package cucumberCommonGeneric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import commonlib.ExcelUtility;
import commonlib.Iconnstant;
import commonlib.javaUtility;
import commonlib.proUtility;
import commonlib.webDriverUtility;

public class Base {
	public static WebDriver driver;
	public proUtility pLib = new proUtility();
	public ExcelUtility eLib = new ExcelUtility();
	public webDriverUtility wLib = new webDriverUtility();
	public javaUtility jLib = new javaUtility();
	 
	
	public static WebDriver getDriver() throws Throwable{
		proUtility pLib = new proUtility();
		String Browser = pLib.getProValue(Iconnstant.proPath, "browser");
 		
 		
 		if(Browser.equalsIgnoreCase("chrome")){
 			driver = new ChromeDriver();
 		}else if (Browser.equalsIgnoreCase("firefox")){
 			driver = new FirefoxDriver();
 		}else if(Browser.equalsIgnoreCase("IE")){
 			driver = new InternetExplorerDriver();
 		}
 		return driver;
	}

}
