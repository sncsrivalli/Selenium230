package framesAndWindows;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * Scenario:
 * Open the browser
 * Enter snapdeal.com
 * MouseHover to Sign in
 * Click on login
 * Enter your mobile number
 * Close the frame
 * Type watches in search text field
 * Click on search 
 * Close the browser
 */
public class FramesPractice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement signIn = driver.findElement(By.className("accountUserName"));
		Actions a = new Actions(driver);
		a.moveToElement(signIn).perform();
		
		driver.findElement(By.xpath("//a[text()='login']")).click();
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@seamless='seamless']"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.id("userName")).sendKeys("546546565");
		Thread.sleep(2000);
		driver.findElement(By.id("close-pop")).click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.name("keyword")).sendKeys("watches");
		driver.findElement(By.className("searchTextSpan")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
