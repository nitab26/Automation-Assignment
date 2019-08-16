package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import generic.BasePage;
import generic.GenericUtils;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="login")
	private WebElement signInLink;
	@FindBy(id="email")
	private WebElement emailAddressTxtBox;
	@FindBy(id="passwd")
	private WebElement pwdTxtBox;
	@FindBy(id="SubmitLogin")
	private WebElement signInBtn;
	@FindBy(xpath="//a[text()='Dresses']")
	private WebElement dropDownMenuDress;
	@FindBy(xpath="//li[@class='last']/a[normalize-space()='Summer Dresses']")
	private WebElement menuSummerDress;
	@FindBy(linkText="http://automationpractice.com/img/p/1/2/12-home_default.jpg")
	private WebElement printedSummerDress1;
	@FindBy(xpath="//a[text()='List']")
	private WebElement listBtn;
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement addToCartBtn;
	@FindBy(xpath="//a[normalize-space()='Proceed to checkout']")
	private WebElement proceedToCheckOutBtn;
	@FindBy(css="a[class='button btn btn-default standard-checkout button-medium'][title='Proceed to checkout']")
	private WebElement proceedToCheckOutBtnSummary;
	@FindBy(xpath="//button[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement proceedToCheckOutBtn1;
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement proceedToCheckOutAddressPageBtn;
	@FindBy(id="search_query_top")
	private WebElement searchTxtBox;
	@FindBy(xpath="//button[@class='btn btn-default button-search']")
	private WebElement searchIconBtn;
	@FindBy(css="a[title='Add to cart'][data-id-product='1']")
	private WebElement addToCartBtnPrdct1;
	@FindBy(css="a[title='Faded Short Sleeve T-shirts']")
	private WebElement prdctImage1;
	@FindBy(id="cgv")
	private WebElement chckBox;
	@FindBy(css="button[class='button btn btn-default standard-checkout button-medium'][type='submit']")
	private WebElement proceedToChckOutBtnShippingPage;
	@FindBy(css="a[class='cheque'][title='Pay by check.']")
	private WebElement payByCheck;
	@FindBy(xpath="//span[text()='I confirm my order']")
	private WebElement confirmOrderBtn;
	@FindBy(css="a[class='logout'][title='Log me out']")
	private WebElement signOutBtn;
	@FindBy(css="button[class='exclusive'][name='Submit']")
	private WebElement addToCartBtnSearch;
	@FindBy(xpath="//span[normalize-space()='Continue shopping']")
	private WebElement continueShoppingBtn;
	@FindBy(xpath="//b[text()='Cart']")
	private WebElement cartBtn;
	@FindBy(xpath="//a[@class='ajax_cart_block_remove_link']")
	private WebElement removeFromCartXBtn;
	@FindBy(id="selectProductSort")
	private WebElement sortBtn;
	@FindBy(css="img[class='replace-2x img-responsive'][alt='Printed Chiffon Dress'][title='Printed Chiffon Dress']")
	private WebElement product7Image;
	@FindBy(css="a[title='Add to cart'][data-id-product='7']")
	private WebElement addToCartBtnPrdct7;
	@FindBy(css="a[class='product_img_link'][href='http://automationpractice.com/index.php?id_product=5&controller=product']")
	private WebElement product5Image;
	@FindBy(css="a[title='Add to cart'][data-id-product='5']")
	private WebElement addToCartBtnPrdct5;
	@FindBy(css="a[class='product_img_link'][href='http://automationpractice.com/index.php?id_product=1&controller=product&search_query=t-shirts&results=1']")
	private WebElement product1Image;
	@FindBy(css="a[title='Add to cart'][data-id-product='2']")
	private WebElement addToCartBtnPrdct2;
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement plusBtn;
	@FindBy(linkText="Women")
	private WebElement menuWomenBtn;
	@FindBy(css="a[href='http://automationpractice.com/index.php?id_product=5&controller=product'][title='View']")
	private WebElement moreBtnPrdct5;
	@FindBy(xpath="//a[@id='color_14']")
	private WebElement blueColorBtn;
	@FindBy(id="group_1")
	private WebElement sizeBtn;
	
	public void clickSignIn(){
		signInLink.click();
	}
	public void setEmailAddress(String emailAddress){
		emailAddressTxtBox.sendKeys(emailAddress);
	}
	public void setPassword(String pwd){
		pwdTxtBox.sendKeys(pwd);
	}
	public void clickSignInBtn(){
		signInBtn.click();
	}
	public void clickSummerDressMenu() {
		//GenericUtils.hover(driver, dropDownMenuDress);
		//BasePage.verifyElementPresentClickable(dropDownMenuDress);
		//BasePage.verifyElementInvisible(By.xpath("//a[text()='Dresses']"));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", dropDownMenuDress);
		//BasePage.verifyElementVisible(dropDownMenuDress);
		//dropDownMenuDress.click();
		//BasePage.verifyElementPresentClickable(menuSummerDress);
		//BasePage.verifyElementInvisible(menuSummerDress);
		menuSummerDress.click();
	}
	public void clickPrintedSummerDress1(){
		printedSummerDress1.click();
	}
	public void clickListBtn(){
		listBtn.click();
	}
	public void clickAddToCartBtn(){
		addToCartBtn.click();
	}
	public void clickProceedToCheckOutWindowBtn(){
		//BasePage.verifyElementPresentClickable(proceedToCheckOutBtn);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", proceedToCheckOutBtn);
		//proceedToCheckOutBtn.click();
	}
	public void clickContinueShoppingWindowBtn(){
		//BasePage.verifyElementPresentClickable(proceedToCheckOutBtn);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", continueShoppingBtn);
		//proceedToCheckOutBtn.click();
	}
	
	public void clickProceedToCheckOutBtnSummaryPage(){
		//BasePage.verifyElementLocated(By.xpath("//a[normalize-space()='Proceed to checkout']"));
		//BasePage.verifyElementVisible(proceedToCheckOutBtn1);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].scrollIntoView();", proceedToCheckOutBtn);
		//executor.executeScript("window.scrollBy(0,1000)");
		executor.executeScript("arguments[0].click();", proceedToCheckOutBtnSummary);
		//proceedToCheckOutBtn.click();
	}
	public void clickProceedToCheckOutAddressPageBtn(){
		BasePage.verifyElementPresentClickable(proceedToCheckOutAddressPageBtn);
		proceedToCheckOutAddressPageBtn.click();
	}
	public void setSearchTxtBox(String searchTxt){
		searchTxtBox.sendKeys(searchTxt);
	}
	public void clickSearchIconBtn(){
		searchIconBtn.click();
	}
	public void clickAddToCartBtnPrdt1(){
		addToCartBtnPrdct1.click();
	}
	public void clickPrdctImage(){
//		GenericUtils.hover(driver, prdctImage1);
		prdctImage1.click();
	}
	public void clickChckBox(){
		chckBox.click();
	}
	public void clickProceedToChckOutBtnShippingPage(){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", proceedToChckOutBtnShippingPage);
		//BasePage.verifyElementPresentClickable(proceedToChckOutBtnShippingPage);
		//proceedToChckOutBtnShippingPage.click();
	}
	public void selectPayByCheck(){
		payByCheck.click();
	}
	public void clickConfirmOrderBtn(){
		confirmOrderBtn.click();
	}
	public void clickSignOut(){
		signOutBtn.click();
	}
	public void clickAddToCartBtnSearch(){
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		BasePage.verifyElementLocated(By.cssSelector("button[class='exclusive'][name='Submit']"));
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click();", addToCartBtnSearch);
		//BasePage.verifyElementPresentClickable(addToCartBtnSearch);
		addToCartBtnSearch.click();
	}
	public void removeItemFromCart(){
		GenericUtils.hover(driver, cartBtn);
		removeFromCartXBtn.click();
	}
	public void sortProductByLowestPrice(){
		GenericUtils.gSelectByValue(sortBtn, "price:asc");
	}
	public void clickAddToCartPrdct7(){
		GenericUtils.hover(driver, product7Image);
		addToCartBtnPrdct7.click();
	}
	public void clickAddToCartPrdct5(){
		GenericUtils.hover(driver, product5Image);
		addToCartBtnPrdct5.click();
	}
	public void clickAddToCartPrdct1(){
		GenericUtils.hover(driver, product1Image);
		addToCartBtnPrdct1.click();
	}
	public void clickAddToCartPrdct2(){
		addToCartBtnPrdct2.click();
	}
	public void clickPlusBtnInSummary(){
		plusBtn.click();
	}
	public void clickWomenMenuBtn(){
		menuWomenBtn.click();
	}
	public void clickMoreBtnPrdct5(){
		moreBtnPrdct5.click();
	}
	public void clickBlueColorBtn(){
		blueColorBtn.click();
	}
	public void clickMediumSizeBtn(){
		GenericUtils.gSelectByValue(sizeBtn, "2");
	}
	

}
