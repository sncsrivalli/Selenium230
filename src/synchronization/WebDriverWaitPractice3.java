package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * Scenario:
 * Open the browser
 * Enter instagram.com
 * Check if login button is enabled or not
 * Enter credentials
 * Re-check if login button is enabled or not
 * close the browser
 */
public class WebDriverWaitPractice3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement loginButton = driver.findElement(By.xpath("//button[.='Log in']"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		} catch (Exception e) {
			System.out.println("Disabled");
		}

		driver.findElement(By.name("username")).sendKeys("546546546");
		driver.findElement(By.name("password")).sendKeys("1564654");

		try {
			wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
		} catch (Exception e) {
			System.out.println("Disabled");
		}
		
		driver.quit();
	}

}
