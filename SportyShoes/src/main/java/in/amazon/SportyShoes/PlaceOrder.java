package in.amazon.SportyShoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder {
	
	
	@FindBy(linkText="Cart")
	private WebElement cart;
	
	@FindBy(xpath="(//a[contains(@class,'btn btn-primary')])")
	private WebElement placeorder;
	
	@FindBy(css="body > div:nth-child(3) > div > strong")
	private WebElement verifyTxt; 
	
	public PlaceOrder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickcart() {
		cart.click();
	}
	public void clickplaceorder() throws InterruptedException {
		Thread.sleep(2000);
		placeorder.click();
	}
	public String verifyText() { 
		String text=verifyTxt.getText();
		return text;
	}


}
