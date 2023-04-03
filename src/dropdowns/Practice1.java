package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * Scenario:
 * Open the browser
 * Enter amazon.com
 * Select elements from All drop down using index, value and text
 * Close the browser
 */
public class Practice1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select s = new Select(dropdown);
		
		s.selectByIndex(5);
		Thread.sleep(2000);
		s.selectByValue("search-alias=computers-intl-ship");
		Thread.sleep(2000);
		s.selectByVisibleText("Electronics");
		Thread.sleep(2000);
		driver.quit();

	}

}
