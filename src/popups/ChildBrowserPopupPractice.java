package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Scenario:
 * Open the browser
 * Enter skillrary.com
 * Click on GEARS
 * Click on Skillrary Essay
 * Type your name in 'Enter name TF'
 * Click on Yes it's my name
 * Close the browser
 */
public class ChildBrowserPopupPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu gear_menu']/descendant::a[text()=' SkillRary Essay']")).click();
		Thread.sleep(3000);
		String parentID = driver.getWindowHandle();
		Set<String> windowIDs = driver.getWindowHandles();
		for (String window : windowIDs) {
			driver.switchTo().window(window);
		}
		
		driver.findElement(By.id("mytext")).sendKeys("Srivalli");
		driver.findElement(By.xpath("//input[@value=\"Yes It's My Name\"]")).click();
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(parentID);
		driver.quit();
		
	}

}
