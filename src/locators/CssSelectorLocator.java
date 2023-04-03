package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Scenario: 
 * Open the browser
 * Enter snapdeal.com
 * Type 'iphone' in search text field
 * Click on search button
 * Type pincode 
 * Click on check
 * Close the browser
 */
public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		
		driver.findElement(By.cssSelector("input#inputValEnter")).sendKeys("iphone");
		driver.findElement(By.cssSelector("span.searchTextSpan")).click();
		driver.findElement(By.cssSelector("input[placeholder='Enter your pincode']")).sendKeys("5546545");
		driver.findElement(By.cssSelector("button.pincode-check")).click();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
