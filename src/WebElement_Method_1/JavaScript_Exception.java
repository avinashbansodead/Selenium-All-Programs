package WebElement_Method_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Exception {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		driver.findElement(By.linkText("Toggle")).click();
		Thread.sleep(2500);
		
		 driver.findElement(By.id("yes")).submit();
		
	}

	
}
