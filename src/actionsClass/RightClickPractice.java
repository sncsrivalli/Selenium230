package actionsClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * Scenario:
 * Open the browser
 * Enter demoapp.skillrary.com
 * Right click on 'Selenium Training'
 * Open in New tab
 * Quit the browser
 */
public class RightClickPractice {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement seleniumTraining = driver.findElement(By.xpath(
				"//li/a[text()='Selenium Training']"));
		
		Actions a = new Actions(driver);
		a.contextClick(seleniumTraining).perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
