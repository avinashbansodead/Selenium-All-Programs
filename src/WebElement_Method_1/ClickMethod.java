package WebElement_Method_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.get("https://flipkart.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
			Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		
	}	

}
