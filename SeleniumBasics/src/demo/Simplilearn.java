package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Simplilearn {
	static WebDriver driver;
	 public static void main(String[] args) {
		        // Set the path to your ChromeDriver executable
		       

		        // Initialize the ChromeDriver
		        
					driver = new ChromeDriver();
				

		        // Maximize the browser window
		        driver.manage().window().maximize();

		        // Navigate to the application - Simplilearn homepage
		        driver.get("https://www.simplilearn.com/");

		        // Hover the pointer over 'All Courses'
		        WebElement allCoursesMenu = driver.findElement(By.linkText("All Courses"));
		        Actions actions = new Actions(driver);
		        actions.moveToElement(allCoursesMenu).build().perform();

		        // Hover the pointer over 'Software Development'
		        WebElement softwareDevelopmentMenu = driver.findElement(By.linkText("Software Development"));
		        actions.moveToElement(softwareDevelopmentMenu).build().perform();

		        // Click on 'Automation Testing Masters Program'
		        WebElement automationTestingProgram = driver.findElement(By.linkText("Automation Testing Masters Program"));
		        automationTestingProgram.click();

		        // Verify the text 'Automation Test Engineer' is visible on the next page
		        String expectedText = "Automation Test Engineer";
		        WebElement pageTextElement = driver.findElement(By.xpath("//*[contains(text(),'" + expectedText + "')]"));
		        String actualText = pageTextElement.getText();

		        if (actualText.contains(expectedText)) {
		            System.out.println("Verification successful. Text '" + expectedText + "' is visible on the page.");
		        } else {
		            System.out.println("Verification failed. Text '" + expectedText + "' is not visible on the page.");
		        }

		        // Close the browser
		        driver.quit();
		    }
		}	