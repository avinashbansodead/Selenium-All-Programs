package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision_Popup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("avinashbansoded@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Avi@1234");
	    driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

}
