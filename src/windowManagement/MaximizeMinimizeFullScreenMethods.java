package windowManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Scenario:
 * Open the browser
 * Enter ebay.com
 * Maximize browser
 * Wait for 2 seconds
 * Minimize browser
 * Wait for 2 seconds
 * View in full screen
 * Wait for 2 seconds
 * Close the browser
 */
public class MaximizeMinimizeFullScreenMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.quit();

	}

}
