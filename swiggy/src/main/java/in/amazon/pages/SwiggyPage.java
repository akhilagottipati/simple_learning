package in.amazon.pages;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwiggyPage {
	private Actions actions;
	private WebDriverWait wait;
	@FindBy(id="location")
	WebElement searchBox;
	@FindBy(xpath="//div[contains(@class,'_1oLDb')]")
	WebElement fullBox;
	@FindBy(xpath="//div[contains(@class,'sc-bczRLJ gWiXXg')][1]")
	WebElement firstItem;
	@FindBy(xpath="//div[contains(@class,'_1RPOp')][1]")
	WebElement add;
	@FindBy(xpath="//span[contains(@class,'_3yZyp _18ZFk')]")
	WebElement cart;
	@FindBy(xpath="//div[contains(@class,'_55uP6')]")
	static
	WebElement checkOut;
	@FindBy(xpath="//div[contains(@class,'_2axtv')][1]")
	static
	WebElement verify;
	
	
	public SwiggyPage(WebDriver driver) {
		 PageFactory.initElements(driver,this);
		 actions=new Actions(driver);
		 wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		 
	}

	public void searchProduct(String item) {
		
		searchBox.sendKeys(item);
		wait.until(ExpectedConditions.visibilityOfAllElements(fullBox));
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		}
	public void item() throws InterruptedException {
		Thread.sleep(5000);
		firstItem.click();
	}
	public void addItem() throws InterruptedException {
		Thread.sleep(5000);
		add.click();
	}
	public void hoverOverToCart() throws InterruptedException {
		Thread.sleep(4000);
		actions.moveToElement(cart).build().perform();
		
	}
	public static void checkItem() throws InterruptedException {
		Thread.sleep(4000);
		
		checkOut.click();
		
	}
	public static String getText() {
		
		String text=verify.getText();
		return text;
	}
}