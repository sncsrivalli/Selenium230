package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement loginButton = driver.findElement(By.name("login"));
		Rectangle r = loginButton.getRect();
		System.out.println("X: "+r.getX());
		System.out.println("Y: "+r.getY());
		System.out.println("Height: "+r.getHeight());
		System.out.println("Width: "+r.getWidth());
		
		driver.quit();

	}

}
