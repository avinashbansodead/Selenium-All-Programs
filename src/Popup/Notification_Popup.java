
package Popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_Popup {

	public static void main(String[] args) {
		ChromeOptions a=new ChromeOptions();
		a.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(a);
		
		
		driver.get("https://www.justdial.com/");
	}

}
