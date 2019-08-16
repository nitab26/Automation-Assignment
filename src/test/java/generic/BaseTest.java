package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant{
	public static WebDriver driver;
	@BeforeMethod
	public void preConditions(){
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		driver=new ChromeDriver();
		//driver=new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void postConditions(){
		driver.close();
	}

}
