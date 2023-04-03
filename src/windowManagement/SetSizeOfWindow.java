package windowManagement;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Scenario:
 * Open the browser
 * Enter instagram.com
 * Maximize the window
 * Wait for 2 seconds
 * set window size to 1024x768
 * Wait for 2 seconds
 * Close the browser
 */
public class SetSizeOfWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Dimension d = new Dimension(1024,768);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		driver.quit();
	}

}
