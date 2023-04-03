package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateAndRefreshPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String url = "https://www.flipkart.com/";
		
		js.executeScript("window.location=arguments[0]", url);
		Thread.sleep(3000);
		js.executeScript("history.go(0)");
		System.out.println(js.executeScript("return document.title"));
		System.out.println(js.executeScript("return document.URL"));
		Thread.sleep(2000);
		WebElement closeButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		js.executeScript("arguments[0].click()", closeButton);
		Thread.sleep(2000);
		WebElement searchTF = driver.findElement(By.name("q"));
		js.executeScript("arguments[0].value=arguments[1]", searchTF, "headphones");
		Thread.sleep(2000);
		WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click()", searchButton);
	}

}
