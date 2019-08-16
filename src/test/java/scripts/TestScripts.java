package scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import generic.BasePage;
import generic.BaseTest;
import generic.Excel;
import pom.HomePage;

public class TestScripts extends BaseTest {
	
	@Test(enabled=true)
	public void productPurchase() throws EncryptedDocumentException, IOException{
		HomePage hp = new HomePage(driver);
		BasePage.verifyTitle("My Store");
		hp.clickSignIn();
		BasePage.verifyTitle("Login - My Store");
		hp.setEmailAddress(Excel.readData("Sheet1", 0, 1));
		hp.setPassword(Excel.readData("Sheet1", 1, 1));
		hp.clickSignInBtn();
		BasePage.verifyTitle("My account - My Store");
		hp.clickSummerDressMenu();
		BasePage.verifyTitle("Summer Dresses - My Store");
		hp.clickAddToCartPrdct5();
		hp.clickProceedToCheckOutWindowBtn();
		BasePage.verifyTitle("Order - My Store");
		driver.navigate().refresh();
		hp.clickProceedToCheckOutBtnSummaryPage();
		BasePage.verifyTitle("Order - My Store");
		hp.clickProceedToCheckOutAddressPageBtn();
		BasePage.verifyTitle("Order - My Store");
		hp.clickChckBox();
		hp.clickProceedToChckOutBtnShippingPage();
		BasePage.verifyTitle("Order - My Store");
		hp.selectPayByCheck();
		BasePage.verifyTitle("My Store");
		hp.clickConfirmOrderBtn();
		BasePage.verifyTitle("Order confirmation - My Store");
		hp.clickSignOut();
		
	}
	
	@Test(enabled=true)
	public void productSearchAndPurchase() throws EncryptedDocumentException, IOException{
		HomePage hp = new HomePage(driver);
		BasePage.verifyTitle("My Store");
		hp.clickSignIn();
		BasePage.verifyTitle("Login - My Store");
		hp.setEmailAddress(Excel.readData("Sheet1", 0, 1));
		hp.setPassword(Excel.readData("Sheet1", 1, 1));
		hp.clickSignInBtn();
		BasePage.verifyTitle("My account - My Store");
		hp.setSearchTxtBox("t-shirts");
		hp.clickSearchIconBtn();
		BasePage.verifyTitle("Search - My Store");
		hp.clickAddToCartPrdct1();
		hp.clickProceedToCheckOutWindowBtn();
		BasePage.verifyTitle("Order - My Store");
		driver.navigate().refresh();
		hp.clickProceedToCheckOutBtnSummaryPage();
		BasePage.verifyTitle("Order - My Store");
		hp.clickProceedToCheckOutAddressPageBtn();
		BasePage.verifyTitle("Order - My Store");
		hp.clickChckBox();
		hp.clickProceedToChckOutBtnShippingPage();
		BasePage.verifyTitle("Order - My Store");
		hp.selectPayByCheck();
		BasePage.verifyTitle("My Store");
		hp.clickConfirmOrderBtn();
		BasePage.verifyTitle("Order confirmation - My Store");
		hp.clickSignOut();
		
	}
	
	@Test(enabled=true)
	public void removeProductFromCart() throws EncryptedDocumentException, IOException{
		HomePage hp = new HomePage(driver);
		BasePage.verifyTitle("My Store");
		hp.clickSignIn();
		BasePage.verifyTitle("Login - My Store");
		hp.setEmailAddress(Excel.readData("Sheet1", 0, 1));
		hp.setPassword(Excel.readData("Sheet1", 1, 1));
		hp.clickSignInBtn();
		BasePage.verifyTitle("My account - My Store");
		hp.setSearchTxtBox("t-shirts");
		hp.clickSearchIconBtn();
		BasePage.verifyTitle("Search - My Store");
		hp.clickListBtn();
		hp.clickAddToCartBtnPrdt1();
		hp.clickContinueShoppingWindowBtn();
		BasePage.verifyTitle("Search - My Store");
		driver.navigate().refresh();
		hp.removeItemFromCart();
		hp.clickSignOut();
		
	}
	
	@Test(enabled=true)
	public void sortProductByLowestPrice() throws EncryptedDocumentException, IOException{
		HomePage hp = new HomePage(driver);
		BasePage.verifyTitle("My Store");
		hp.clickSignIn();
		BasePage.verifyTitle("Login - My Store");
		hp.setEmailAddress(Excel.readData("Sheet1", 0, 1));
		hp.setPassword(Excel.readData("Sheet1", 1, 1));
		hp.clickSignInBtn();
		BasePage.verifyTitle("My account - My Store");
		hp.setSearchTxtBox("dresses");
		hp.clickSearchIconBtn();
		BasePage.verifyTitle("Search - My Store");
		hp.sortProductByLowestPrice();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		hp.clickAddToCartPrdct7();
		hp.clickProceedToCheckOutWindowBtn();
		BasePage.verifyTitle("Order - My Store");
		driver.navigate().refresh();
		hp.clickProceedToCheckOutBtnSummaryPage();
		BasePage.verifyTitle("Order - My Store");
		hp.clickProceedToCheckOutAddressPageBtn();
		BasePage.verifyTitle("Order - My Store");
		hp.clickChckBox();
		hp.clickProceedToChckOutBtnShippingPage();
		BasePage.verifyTitle("Order - My Store");
		hp.selectPayByCheck();
		BasePage.verifyTitle("My Store");
		hp.clickConfirmOrderBtn();
		BasePage.verifyTitle("Order confirmation - My Store");
		hp.clickSignOut();
		
	}
	
	@Test(enabled=true)
	public void viewProductInListMode() throws EncryptedDocumentException, IOException{
		HomePage hp = new HomePage(driver);
		BasePage.verifyTitle("My Store");
		hp.clickSignIn();
		BasePage.verifyTitle("Login - My Store");
		hp.setEmailAddress(Excel.readData("Sheet1", 0, 1));
		hp.setPassword(Excel.readData("Sheet1", 1, 1));
		hp.clickSignInBtn();
		BasePage.verifyTitle("My account - My Store");
		hp.setSearchTxtBox("dresses");
		hp.clickSearchIconBtn();
		BasePage.verifyTitle("Search - My Store");
		hp.clickListBtn();
		hp.clickAddToCartPrdct2();
		hp.clickProceedToCheckOutWindowBtn();
		BasePage.verifyTitle("Order - My Store");
		driver.navigate().refresh();
		hp.clickProceedToCheckOutBtnSummaryPage();
		BasePage.verifyTitle("Order - My Store");
		hp.clickProceedToCheckOutAddressPageBtn();
		BasePage.verifyTitle("Order - My Store");
		hp.clickChckBox();
		hp.clickProceedToChckOutBtnShippingPage();
		BasePage.verifyTitle("Order - My Store");
		hp.selectPayByCheck();
		BasePage.verifyTitle("My Store");
		hp.clickConfirmOrderBtn();
		BasePage.verifyTitle("Order confirmation - My Store");
		hp.clickSignOut();
	}
	
	@Test(enabled=true)
	public void incrementProductQuantityInSummary() throws EncryptedDocumentException, IOException{
		HomePage hp = new HomePage(driver);
		BasePage.verifyTitle("My Store");
		hp.clickSignIn();
		BasePage.verifyTitle("Login - My Store");
		hp.setEmailAddress(Excel.readData("Sheet1", 0, 1));
		hp.setPassword(Excel.readData("Sheet1", 1, 1));
		hp.clickSignInBtn();
		BasePage.verifyTitle("My account - My Store");
		hp.setSearchTxtBox("dresses");
		hp.clickSearchIconBtn();
		BasePage.verifyTitle("Search - My Store");
		hp.clickListBtn();
		hp.clickAddToCartPrdct2();
		hp.clickProceedToCheckOutWindowBtn();
		BasePage.verifyTitle("Order - My Store");
		driver.navigate().refresh();
		hp.clickPlusBtnInSummary();
		hp.clickProceedToCheckOutBtnSummaryPage();
		BasePage.verifyTitle("Order - My Store");
		hp.clickProceedToCheckOutAddressPageBtn();
		BasePage.verifyTitle("Order - My Store");
		hp.clickChckBox();
		hp.clickProceedToChckOutBtnShippingPage();
		BasePage.verifyTitle("Order - My Store");
		hp.selectPayByCheck();
		BasePage.verifyTitle("My Store");
		hp.clickConfirmOrderBtn();
		BasePage.verifyTitle("Order confirmation - My Store");
		hp.clickSignOut();
		
	}
	@Test(enabled=true)
	public void selectAColorForProduct() throws EncryptedDocumentException, IOException{
		HomePage hp = new HomePage(driver);
		BasePage.verifyTitle("My Store");
		hp.clickSignIn();
		BasePage.verifyTitle("Login - My Store");
		hp.setEmailAddress(Excel.readData("Sheet1", 0, 1));
		hp.setPassword(Excel.readData("Sheet1", 1, 1));
		hp.clickSignInBtn();
		BasePage.verifyTitle("My account - My Store");
		hp.clickWomenMenuBtn();
		BasePage.verifyTitle("Women - My Store");
		hp.clickListBtn();
		hp.clickMoreBtnPrdct5();
		BasePage.verifyTitle("Printed Summer Dress - My Store");
		hp.clickBlueColorBtn();
		hp.clickAddToCartBtn();
		hp.clickProceedToCheckOutWindowBtn();
		BasePage.verifyTitle("Order - My Store");
		driver.navigate().refresh();
		hp.clickProceedToCheckOutBtnSummaryPage();
		BasePage.verifyTitle("Order - My Store");
		hp.clickProceedToCheckOutAddressPageBtn();
		BasePage.verifyTitle("Order - My Store");
		hp.clickChckBox();
		hp.clickProceedToChckOutBtnShippingPage();
		BasePage.verifyTitle("Order - My Store");
		hp.selectPayByCheck();
		BasePage.verifyTitle("My Store");
		hp.clickConfirmOrderBtn();
		BasePage.verifyTitle("Order confirmation - My Store");
		hp.clickSignOut();
	}
	@Test(enabled=true)
	public void selectASizeForProduct() throws EncryptedDocumentException, IOException{
		HomePage hp = new HomePage(driver);
		BasePage.verifyTitle("My Store");
		hp.clickSignIn();
		BasePage.verifyTitle("Login - My Store");
		hp.setEmailAddress(Excel.readData("Sheet1", 0, 1));
		hp.setPassword(Excel.readData("Sheet1", 1, 1));
		hp.clickSignInBtn();
		BasePage.verifyTitle("My account - My Store");
		hp.clickWomenMenuBtn();
		BasePage.verifyTitle("Women - My Store");
		hp.clickListBtn();
		hp.clickMoreBtnPrdct5();
		BasePage.verifyTitle("Printed Summer Dress - My Store");
		hp.clickMediumSizeBtn();
		hp.clickAddToCartBtn();
		hp.clickProceedToCheckOutWindowBtn();
		BasePage.verifyTitle("Order - My Store");
		driver.navigate().refresh();
		hp.clickProceedToCheckOutBtnSummaryPage();
		BasePage.verifyTitle("Order - My Store");
		hp.clickProceedToCheckOutAddressPageBtn();
		BasePage.verifyTitle("Order - My Store");
		hp.clickChckBox();
		hp.clickProceedToChckOutBtnShippingPage();
		BasePage.verifyTitle("Order - My Store");
		hp.selectPayByCheck();
		BasePage.verifyTitle("My Store");
		hp.clickConfirmOrderBtn();
		BasePage.verifyTitle("Order confirmation - My Store");
		hp.clickSignOut();
	}
	
	
}
