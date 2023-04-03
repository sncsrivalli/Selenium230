package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartInterviewScenario {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement electronics = driver.findElement(By.xpath("//img[@alt='Electronics']"));
		Actions a = new Actions(driver);
		a.moveToElement(electronics).perform();
		
		WebElement laptopAndDesktop = driver.findElement(By.xpath("//a[text()='Laptop and Desktop']"));
		a.moveToElement(laptopAndDesktop).perform();
		
		driver.findElement(By.xpath("//a[text()='Gaming Laptops']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Lenovo']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		Thread.sleep(3000);
		WebElement type = driver.findElement(By.xpath("//div[text()='Type']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true)", type);
		type.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Gaming Laptop']")).click();
		Thread.sleep(3000);
		WebElement priceHighToLow = driver.findElement(By.xpath("//div[text()='Price -- High to Low']"));
		//js.executeScript("arguments[0].scrollIntoView(true)", priceHighToLow);
		priceHighToLow.click();
		Thread.sleep(2000);
		WebElement lenovo = driver.findElement(By.xpath("//a[text()='Lenovo Legion 5 Pro Core i7 11th Gen - (16 GB/1 TB SSD/...']"));
		a.moveToElement(lenovo).perform();
		
		driver.findElement(By.xpath("//a[text()='Lenovo Legion 5 Pro Core i7 11th Gen - (16 GB/1 TB SSD/...']/following-sibling::div[@class='nihHSd']/descendant::div[@class='_24_Dny']")).click();
		
	}

}
