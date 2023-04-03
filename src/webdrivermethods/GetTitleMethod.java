package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Scenario: 
 * Open the browser
 * Enter facebook.com
 * Get the title of the page
 * Verify
 */
public class GetTitleMethod {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Facebook"))
			System.out.println("Pass");
		else
			System.out.println("Fail");

	}

}
