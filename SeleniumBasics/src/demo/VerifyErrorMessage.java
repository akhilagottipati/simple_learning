package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {
	public static void main(String[] args) {
		// 1)open the browser
		ChromeDriver driver = new ChromeDriver();
		
		// 2)navigate to application
		driver.get("https://facebook.com");
		
		//3)enter invalid username 'batman554466@gmail.com' in the email or phone number' text box
		driver.findElement(By.id("email")).sendKeys("batman554466@gmail.com");
		
		//4)enter invalid password 'password@123' in 'password' text box
		driver.findElement(By.id("pass")).sendKeys("password@123");
		
		//5)click login button 
		driver.findElement(By.name("login")).click();
		
		//6)verify user sees the error message "The email address you entered isn't connected to an account. Find your account and log in."
		String expectedErrMsg = "The email address you entered isn't connected to an account. Find your account and log in.";
		String actualErrMsg = driver.findElement(By.xpath("(//div[contains(@class,'ay')])[3]")).getText();
		
		if (expectedErrMsg.equals(actualErrMsg)) {
			System.out.println("Testcase passed");
		}
		else {
			System.out.println("Testcase failed");
		}
		//7)closes the browser
		driver.quit();
	}

}
