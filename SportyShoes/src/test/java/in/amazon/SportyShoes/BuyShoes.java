package in.amazon.SportyShoes;

import org.openqa.selenium.JavascriptExecutor;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyShoes  extends BaseTest {
	
	@Test
	public void newregister() throws InterruptedException {
		
		
		
		RegisterPage registerpage = new RegisterPage(driver); 
		LoginPage loginpage = new LoginPage(driver);
		AddToCard addtocard = new AddToCard(driver);
		
		
		
		
		registerpage.clickNewRegister();
		registerpage.entername("akhila");
		registerpage.enteremail("akhila@gmail.com");
		registerpage.enterpassword("akhila123");
		registerpage.clickregister();
		Thread.sleep(4000);
		
		
		loginpage.clicklogout();
		loginpage.enteremail("akhila@gmail.com");
		Thread.sleep(2000);
		loginpage.enterpassword("akhila123");
		Thread.sleep(5000);
		loginpage.clicklogin();
		Thread.sleep(2000);
		
		PlaceOrder placeorder = new PlaceOrder(driver);
		Thread.sleep(2000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,1000)", "");
		
		addtocard.clickaddtocard();
		
		Thread.sleep(4000);
		addtocard.clickhome();
		
		placeorder.clickcart();
		
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,600)", "");
		placeorder.clickplaceorder();
		Thread.sleep(3000);
		
		String exceptedErrmsg="Success!";
		String actualErrmsg=placeorder.verifyText();
		Assert.assertEquals(exceptedErrmsg, actualErrmsg);
		
	}

}
