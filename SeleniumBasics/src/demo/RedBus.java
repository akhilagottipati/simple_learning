package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RedBus {
	private ChromeDriver driver;
	

    @BeforeClass
    public void setUp() {
    	ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
    	 driver = new ChromeDriver();
    	 driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
    }

    @Test
    
    public void testBusTicketBooking() throws InterruptedException {
    	driver.findElement(By.xpath("(//span[contains(@class,'name_rb_vertical')])[1]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'sc-htoDjs kyqvCq')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[contains(@class,'sc-bxivhb hrsLPT')])[1]")).sendKeys("Hyderabad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//text[contains(@class,'placeHolderMainText')])[2]")).click();

		//driver.findElement(By.xpath("(//div[contains(@class,'sc-htoDjs kyqvCq')])[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("dest")).sendKeys("Guntur");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//text[contains(@class,'placeHolderMainText')])[3]")).click();
		driver.findElement(By.cssSelector("#onwardCal > div > div.sc-jzJRlG.dPBSOp > div > div > div:nth-child(3) > div:nth-child(6) > span > div:nth-child(1)")).click();
		driver.findElement(By.id("search_button")).click();
		
   
    }

   @AfterClass
   public void tearDown() {
       driver.quit();
    }


}
