package autoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Scenario:
 * Open the browser
 * Enter amazon.com
 * Type 'laptops' in search text field
 * Fetch all auto suggestions 
 * Close the browser
 */
public class Practice1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//div[contains(@aria-label,'laptops')]"));
		
		for(WebElement element: autoSuggestions) {
			System.out.println(element.getText());
		}
		
		driver.quit();

	}

}
