package JavaScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_By_Method {
public static void main(String[] args) {
	

	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.google.com/doodles");
	try {
		driver.findElement(By.linkText("Slovenia Statehood Day 2023")).click();	
	} catch (Exception e) {
		//ChromeDriver jse= new ChromeDriver() ;
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1500)");
	
	}
 
}
}