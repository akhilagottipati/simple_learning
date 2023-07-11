package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class AmazonAutomation {
	   public static void main(String[] args) {
	    //1)open the browser
	    ChromeDriver driver = new ChromeDriver();

	    //maximize it
	    driver.manage().window().maximize();
	     

	       // Navigate to Amazon India website
	       driver.get("https://www.amazon.in/");

	       // Click on 'Mobiles' in the navigation bar
	       WebElement mobilesLink = driver.findElement(By.linkText("Mobiles"));
	       mobilesLink.click();

	       // Hover the pointer over 'Mobiles & Accessories'
	       WebElement mobilesAccessoriesLink = driver.findElement(By.linkText("Mobiles & Accessories"));
	       Actions actions = new Actions(driver);
	       actions.moveToElement(mobilesAccessoriesLink).perform();

	       // Click on 'Apple' in the sub-menu
	       WebElement appleLink = driver.findElement(By.linkText("Apple"));
	       appleLink.click();

	       // Click on the first available phone
	       WebElement firstPhone = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div[3]/div[1]/h2/a/span"));
	       firstPhone.click();

	       // Switch focus to the new tab
	       String originalHandle = driver.getWindowHandle();
	       for (String handle : driver.getWindowHandles()) {
	           if (!handle.equals(originalHandle)) {
	               driver.switchTo().window(handle);
	               break;
	           }
	       }

	       // Click on 'Buy Now' button
	       WebElement buyNowButton = driver.findElement(By.id("buy-now-button"));
	       buyNowButton.click();

	       // Verify if the 'Sign in' text is present on the page
	       boolean signInTextPresent = driver.getPageSource().contains("Sign in");
	       if (signInTextPresent) {
	           System.out.println("Sign in text is present.");
	       } else {
	           System.out.println("Sign in text is not present.");
	       }

	       // Close the browser
	       driver.quit();
	   }



}
