package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Alert_PopUp 
{
  public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
//		driver.findElement(By.id("accept")).click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//		driver.findElement(By.id("confirm")).click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//		driver.findElement(By.id("confirm")).click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(2000);
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
	
		Alert al= driver.switchTo().alert();
		Thread.sleep(2000);
		al.sendKeys("xyz");
		al.accept();
	
	
		
	}

}
