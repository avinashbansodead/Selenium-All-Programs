package Locators_Id_Name_Class_LinkText_PartialLinkText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedText1 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		System.out.println("Driver Registerded Sucefully");
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		
	driver.findElement(By.linkText("Edit")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("fullName")).sendKeys("Avinash Dattatray Bansode");
	Thread.sleep(2000);
	
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Click")).click();
	//driver.findElement(By.partialLinkText("Forgot your password?")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Drop-Down")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Dialog")).click();
	
	
		
		
		
		
	}
	}




