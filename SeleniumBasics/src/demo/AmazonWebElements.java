package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

	public class AmazonWebElements {

		public static void main(String[] args) throws InterruptedException {

			 //1)open the browser
			ChromeDriver driver=new ChromeDriver();
             //2)//maximize it
			driver.manage().window().maximize();
			//3) Navigate to Amazon India web site
			driver.get("https://www.amazon.in");
			//4)Click on 'Mobiles' in the navigation bar
			driver.findElement(By.linkText("Mobiles")).click();
			//5)Hover the pointer over 'Mobiles & Accessories'
			driver.findElement(By.linkText("Mobiles & Accessories")).click();
			//6)Click on 'Apple' in the sub-menu
	        driver.findElement(By.linkText("Apple")).click();
	        //7) Click on the first available phone
	        driver.findElement(By.xpath("(//span[contains(@class,'a-size-base-plus a-color-base a-text-normal')][1])")).click();
	        //8)Switch focus to the new tab
	        String originalHandle = driver.getWindowHandle();
	        for (String handle : driver.getWindowHandles()) {
	            if (!handle.equals(originalHandle)) {
	                driver.switchTo().window(handle);
	                break;
	            }
	        }
	        //9)Click on 'Buy Now' button
	        driver.findElement(By.id("buy-now-button")).click();
	        //10)Close the browser
	        driver.quit();
}
	}
