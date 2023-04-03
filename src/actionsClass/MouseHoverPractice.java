package actionsClass;

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
 * Mouse hover on course
 * Click on Selenium Training
 * Close the browser
 */

public class MouseHoverPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement courseTab = driver.findElement(By.id("course"));
		Actions a = new Actions(driver);
		a.moveToElement(courseTab).perform();
		
		driver.findElement(By.xpath("//span[@class='wrappers']/a[text()='Selenium Training']")).click();
		
		driver.quit();

	}

}
