package commonlib;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class webDriverUtility {
	//WebDriver driver;
	
	public void waitForpageload(WebDriver driver,int waitTime){
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
	
	public void WaitForVisisbleDElement(WebDriver driver,int WaitTime,WebElement element){
		
		WebDriverWait wait = new WebDriverWait(driver,WaitTime);
		
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public void Select(WebElement element,String text){
		Select s1 = new Select(element);
		s1.selectByVisibleText(text);
	}
	public void Select(String text,WebElement element){
		Select s1 = new Select(element);
		
		s1.selectByValue(text);
	}
	
	public void Select(int  index,WebElement element){
		Select s1 = new Select(element);
		
		s1.selectByIndex(index);
	}
	
	public void MouseOverOperatoion(WebDriver driver ,WebElement element){
		Actions a1 = new Actions(driver);
		a1.moveToElement(element);
		
	}
	public void ContextClick(WebDriver driver,WebElement element){
		Actions a1 = new Actions(driver);
		a1.contextClick(element);
	}
	public void DrageAndDrop(WebDriver driver,WebElement sourceElement,WebElement tragetElement){
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(sourceElement, tragetElement);
	}
	
	public void SwitchWin(WebDriver driver ,String windowTitle){
		Set<String> window = driver.getWindowHandles();
		 Iterator<String> it = window.iterator();
		 while(it.hasNext()){
			String winId = it.next();
			 driver.switchTo().window(winId);
			 String actTitle = driver.getTitle();
			 if(actTitle.contains(windowTitle)){
				 System.out.println("control got switched");
				 break;
			 } 
		 }
		 
		 
	}
	 public void TakeScreenShotjpg(String  screenshot,WebDriver driver) throws Throwable{
		 
		 TakesScreenshot ts = (TakesScreenshot)driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 
		File disc = new File("./screenshot"+screenshot+".jpg");
		Files.copy(src, disc);
		 
	 }
	 public void Takescreenshotpng(String Screenshot,WebDriver driver) throws Throwable{
		 TakesScreenshot ts = (TakesScreenshot)driver;
		 File Src = ts.getScreenshotAs(OutputType.FILE);
		File dsct = new File("./screenshot"+Screenshot+".PNG");
		Files.copy(Src, dsct);
		 
	 }
	
	public void AlertAccpet(WebDriver driver){
		driver.switchTo().alert().accept();
		
	}
	
	public void AlertCancle(WebDriver driver){
		
		driver.switchTo().alert().dismiss();
	}
	
	public void SwitchToFrame(WebDriver driver, String idorName){
		driver.switchTo().frame(idorName);
	}
	
	public void SwitchToFrame(WebDriver driver,int Index){
		 driver.switchTo().frame(Index);
	}

}
