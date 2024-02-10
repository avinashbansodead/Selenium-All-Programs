
package Xpath_byAttriute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElement_Exception {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		System.out.println("Driver Registerded Sucefully");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='Grocery1']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
	}
	}
	



