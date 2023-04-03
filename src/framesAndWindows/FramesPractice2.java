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
public class FramesPractice2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement sigin=driver.findElement(By.xpath("//div[@class='accountInner']"));
		Actions a=new Actions(driver);
		a.moveToElement(sigin).perform();
		WebElement login=driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']"));
		login.click();
		driver.switchTo().frame("loginIframe");
		driver.switchTo().frame("iframeLogin");
		driver.switchTo().frame(login);
		driver.findElement(By.id("userName")).sendKeys("57686878");
		driver.findElement(By.id("close-pop")).click();
		driver.switchTo().defaultContent();
		
		
	}
}
