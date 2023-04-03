package framesAndWindows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Scenario:
 * Open the browser
 * Enter google.com
 * Open new Tab
 * Enter facebook.com
 * Close facebook.com
 * Exit browser
 */
public class SwitchToTAB {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		driver.close();
		Thread.sleep(2000);
		driver.quit();

	}

}
