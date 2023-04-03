package framesAndWindows;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesNDTVTask {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ndtv.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()=\"CROSSWORD\"]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//span[text()=\"Reveal \"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("revealWord")).click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()=\"CRICKET\"]")).click();
		Thread.sleep(2000);
		
		driver.quit();
		


	}

}
