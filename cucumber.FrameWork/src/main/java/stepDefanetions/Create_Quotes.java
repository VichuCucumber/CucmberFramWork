package stepDefanetions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.crm.zeeleo.pom.CreateQuotes;
import com.crm.zeeleo.pom.Quotes;
import com.crm.zeeleo.pom.QuotesInfo;
import com.crm.zeeleo.pom.homePage;

import commonlib.Base_Test;
import commonlib.ExcelUtility;
import commonlib.javaUtility;
import commonlib.proUtility;
import commonlib.webDriverUtility;
import cucumberCommonGeneric.Base;
//import cucumberCommonGeneric.Base_Class;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Create_Quotes  extends Base {
	
	public proUtility pLib = new proUtility();
	public ExcelUtility eLib = new ExcelUtility();
	public webDriverUtility wLib = new webDriverUtility();
	public javaUtility jLib = new javaUtility();
	
	 @Given("^Navigate to create quotes Page$")
	    public void navigate_to_create_quotes_page() throws Throwable {
		 
		 wLib.waitForpageload(driver, 10);
		 homePage hp = new homePage(driver);
		    hp.getMore().click();
		    Thread.sleep(10000);
		   hp.getQoutes().click();
		 
		  Quotes qP = new Quotes(driver);
		  qP.getquoteIcon().click();
		 System.out.println("navigated to cretae ouotes page");
	        
	    }

	    @When("^Create Quotes with subject,orgName,productName,productQty$")
	    public void create_quotes_with_subjectorgnameproductnameproductqty(DataTable Data) throws Throwable {
	    	List<List<String>> obj = Data.asLists();
	    	String subject = obj.get(0).get(0);
	    	String orgName = obj.get(0).get(1);
	    	String bAddress = obj.get(0).get(2);
	    	String sAddress = obj.get(0).get(3);
	    	String productName = obj.get(0).get(4);
	    	String qty = obj.get(0).get(5);
	    	
	    	
	    	//wLib.waitForpageload(driver, 10);
	  	  //navigate to create quotes Page
	  	   CreateQuotes cQ = new CreateQuotes(driver);
	  	   cQ.CreateQuote(subject, orgName, bAddress, sAddress, productName,qty);
	  	   System.out.println("quotes created");
	    	
	    }
	    @Then("^verify the Quotes \"([^\"]*)\" Is created Succesfully$")
	    public void verify_the_quotes_something_is_created_succesfully(String subName) throws Throwable {
	    	wLib.waitForpageload(driver, 10);
	    	QuotesInfo qI = new QuotesInfo(driver);
		   	  //wLib.WaitForVisisbleDElement(driver, 10, qI.getSucssfulMasg());
		   	  
		   	  String CreatedQoutes = qI.GetSucccessFullmasg();
		   	  boolean successfullyCreatedQuotes = CreatedQoutes.contains(subName);
		   	  Assert.assertTrue(successfullyCreatedQuotes);
		   	  System.out.println(CreatedQoutes);
		   	  System.out.println(subName);
		   	  
		    	 System.out.println("successfully verified the created Qouted");
		       
	        
	    }
	    

	  

	    


}
