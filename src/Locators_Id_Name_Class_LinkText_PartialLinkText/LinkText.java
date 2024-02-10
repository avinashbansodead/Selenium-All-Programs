package Locators_Id_Name_Class_LinkText_PartialLinkText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		System.out.println("Driver Registerded Sucefully");
		driver.manage().window().maximize();
		driver.get("https://www.jio.com/");
		
		driver.findElement(By.linkText("Mobile")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("True 5G")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("JioFiber")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Business")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Shop")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Apps")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Support")).click();
		
		
		
		
		
	}
	}


