package in.amazon.teststeps;

import org.openqa.selenium.chrome.ChromeDriver;


import in.amazon.pages.SwiggyPage;



public class Driver extends Tools {
	protected static SwiggyPage swiggyPage; 
	public static void init() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		
		swiggyPage=new SwiggyPage(driver);

				
			}
}

