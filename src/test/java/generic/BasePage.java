package generic;



import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {
	public static WebDriver driver;
	public BasePage(WebDriver driver){
		this.driver=driver;
	}
	public static void verifyTitle(String eTitle){
		try{
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Title is matching"+eTitle,true);
		}
		catch(Exception e){
			Reporter.log("Title is not matching",true);
		}
	}
	public static void verifyElementPresent(WebElement element){
		try{
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("The element is present"+element,true);
		}
		catch(Exception e){
			Reporter.log("the element is not present",true);
		}
	}
	public static void verifyElementVisible(WebElement element){
		try{
			WebDriverWait wait=new WebDriverWait(driver,50);
			//wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			Reporter.log("The element is present"	,true);
		}
		catch(Exception e){
			Reporter.log("the element is not present",true);
		}
	}
	public static void verifyElementPresentClickable(WebElement element){
		try{
			WebDriverWait wait=new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			Reporter.log("The element is present"+element,true);
		}
		catch(Exception e){
			Reporter.log("the element is not present",true);
		}
	}
	public static void verifyElementLocated(By locator){
		try{
			WebDriverWait wait = new WebDriverWait(driver, 120);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			Reporter.log("Element is located",true);
		}
		catch(Exception e){
			Reporter.log("Element is not located",true);
		}
	}
	public static void switchToWindow(String parentWindow){
		
		Reporter.log("Window"+parentWindow,true);
		Set<String> allWindows = driver.getWindowHandles();
		for(String curWindow : allWindows){
		    driver.switchTo().window(curWindow);
		}
	}

}
