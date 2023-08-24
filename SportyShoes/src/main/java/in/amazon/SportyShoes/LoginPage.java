package in.amazon.SportyShoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(linkText="Logout")
	private WebElement logout;
	
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id = "password")
	private WebElement password; 
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	private WebElement login;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enteremail(String mailid) {
		email.click();
		email.sendKeys(mailid);
	}
	
	public void enterpassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}
		
	
	public void clicklogin() {
		login.click();
	}
	
	public void clicklogout() {
		logout.click();
	}
	
	
	

}
