package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Scenario:
 * Open the browser
 * Enter facebook.com
 * Enter number into the User name text field
 * Clear the user name text field
 * Enter email ID and password
 * Click on login button
 * Close the browser 
 */
public class ClearSubmitMethodsPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement usernameTF = driver.findElement(By.id("email"));
		usernameTF.sendKeys("565654656");
		Thread.sleep(2000);
		usernameTF.clear();
		Thread.sleep(2000);
		usernameTF.sendKeys("abc@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("566545");
		driver.findElement(By.name("login")).submit();
		Thread.sleep(2000);
		driver.quit();
	}

}
