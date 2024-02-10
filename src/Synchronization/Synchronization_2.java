package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization_2 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Driver1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");

	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("logoutLink")).click();
	String expectedtitle="actiTIME - Login";
	String ele=	driver.getTitle();
	System.out.println(expectedtitle);
	
	if(ele.equals(expectedtitle))
	{
		System.out.println("True");
	}
	else
	{
		System.out.println("False");
	}
	System.out.println(ele);
	
}


}
