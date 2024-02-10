package Xpath_byAttriute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByAttribute {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Driver2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		System.out.println("Driver Registerded Sucefully");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='Grocery']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//img[@alt='Fashion']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='Electronics']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='Home & Furniture']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='Appliances']")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//img[@alt='Travel']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@alt='Top Offers']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@alt='Beauty, Toys & More']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='Two Wheelers']")).click();
		Thread.sleep(2000);
		
		System.out.println("Software is checked sucefully");
		
	}
	}
	



