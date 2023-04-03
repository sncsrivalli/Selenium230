package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2Feb9th {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.id("gh-ac")).sendKeys("watches");
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(3000);
		
		driver.quit();
	}

}
