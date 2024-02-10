package Locators_Id_Name_Class_LinkText_PartialLinkText;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkedText1 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		System.out.println("Driver Registerded Sucefully");
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
	//driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.partialLinkText("Forgot your password?")).click();
	
		
		
		
		
	}
	}



