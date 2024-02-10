package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_Url {
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Driver1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://demo.actitime.com/login.do");
		
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");

	driver.findElement(By.id("loginButton")).click();
	String expectedturl="https://demo.actitime.com/login.do/pune";
	wait.until(ExpectedConditions.urlToBe(expectedturl));
	
	String actualurl=	driver.getCurrentUrl();
	System.out.println(actualurl);
	
	if(actualurl.equals(expectedturl))
	{
		System.out.println("True");
	}
	else
	{
		System.out.println("False");
	}
	System.out.println(actualurl);
	
}


}