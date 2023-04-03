package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Scenario:
 * Open the browser
 * Enter amazon.com
 * Get the title of the web page
 * Get the url of the web page
 */
public class GetCurrentUrlMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
		System.out.println(title+"\n"+url);

	}

}
