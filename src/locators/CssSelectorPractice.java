package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Scenario:
 * Open the browser
 * Enter demo.actitime.com
 * Enter username and password
 * Click on login button
 * Verify home page
 * Close the browser
 */
public class CssSelectorPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		
		Thread.sleep(5000);
		if(driver.getTitle().contains("Time-Track"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		driver.quit();

	}

}
