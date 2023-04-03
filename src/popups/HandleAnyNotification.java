package popups;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleAnyNotification {

	public static void main(String[] args) throws InterruptedException {
		
		HashMap<String, Integer> contentSettings = new HashMap<>();
		contentSettings.put("notifications", 1);
		contentSettings.put("geolocation", 2);
		
		HashMap<String, Object> profile = new HashMap<>();
		profile.put("managed_default_content_settings", contentSettings);
		
		HashMap<String, Object> preference = new HashMap<>();
		preference.put("profile", profile);
		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		options.setExperimentalOption("prefs", preference);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		
		Thread.sleep(6000);
		
		driver.quit();

	}

}
