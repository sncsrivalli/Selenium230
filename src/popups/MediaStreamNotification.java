package popups;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MediaStreamNotification {

	public static void main(String[] args) throws InterruptedException {
		HashMap<String, Integer> contentSettings = new HashMap<>();
		contentSettings.put("media_stream", 1);
				
		HashMap<String, Object> profile = new HashMap<>();
		profile.put("managed_default_content_settings", contentSettings);
		
		HashMap<String, Object> preference = new HashMap<>();
		preference.put("profile", profile);
		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		options.setExperimentalOption("prefs", preference);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://webcamtests.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("webcam-launcher")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
