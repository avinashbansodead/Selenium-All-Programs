package Xpath_ByText_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_ByText_Flipkart 
{
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	System.out.println("Driver Registerded Sucefully");
	driver.manage().window().maximize();
	driver.get("https:/www.flipkart.com/");
	
	
	
	driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(2000);
	
	
	
	driver.findElement(By.xpath("//div[text()='Grocery']")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[text()='Appliances']")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[text()='Travel']")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//div[text()='Top Offers']")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	
	
	
	
	System.out.println("Flipkart Xpath by text checked Sucefully");
	
	
	

}
}
