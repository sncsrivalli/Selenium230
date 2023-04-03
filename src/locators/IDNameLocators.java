package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Scenario:
 * Open the browser
 * Enter facebook.com
 * Enter user name and password
 * Click on login button
 * Close the browser
 */
public class IDNameLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("54654551635");
		driver.findElement(By.id("pass")).sendKeys("656213213");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
