package in.amazon.SportyShoes;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCard {
	
	
	
	@FindBy(xpath="(//a[contains(@class,'btn btn-primary')])[1]")
	private WebElement addtocard;
	
	@FindBy(linkText="Home")
	private WebElement home;
	
	public AddToCard(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickaddtocard() throws InterruptedException {
		Thread.sleep(5000);
		addtocard.click();
		
		
	}
	public void clickhome() {
		home.click();
		
	}
	


}
