package in.amazon.SportyShoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	
	@FindBy(linkText="New User? Register Here")
	private WebElement ClicknewRegister;
	
	@FindBy(id = "name")
	private WebElement name;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Register')]")
	private WebElement register;
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickNewRegister() {
		ClicknewRegister.click();
		
	}
	public void entername(String username) {
		name.sendKeys(username);
	}
	public void enteremail(String mailid) {
		email.click();
		email.sendKeys(mailid);
	}
	
	public void enterpassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}
	
	public void clickregister() {
		register.click();
	}

}
