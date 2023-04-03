package autoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("dress");
		
		List<WebElement> autoSuggestions = 
				driver.findElements(By.xpath("//ul/li[@class='sbct']"));
		
		for(WebElement element: autoSuggestions) {
			System.out.println(element.getText());
		}
		
		driver.quit();

	}

}
