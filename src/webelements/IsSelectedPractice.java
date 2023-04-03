package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Scenario:
 * Open the browser
 * Enter demo.actitime.com
 * Click on Keep me Logged in check box
 * Verify if the check box is selected or not
 * Close the browser
 */
public class IsSelectedPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		checkbox.click();
		
		if(checkbox.isSelected())
			System.out.println("Checkbox selected");
		else
			System.out.println("Checkbox not selected");
		
		driver.quit();
	}

}
