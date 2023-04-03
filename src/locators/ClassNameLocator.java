package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Scenario:
 * Open the browser
 * Enter snapdeal.com
 * Type 'iphone' in search text field
 * Click on search
 * Close the browser
 */
public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		
		driver.findElement(By.className("searchformInput")).sendKeys("iphone");
		driver.findElement(By.className("searchTextSpan")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
