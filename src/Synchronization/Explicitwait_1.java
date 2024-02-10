package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait_1 {
	private static String expectedtitle;

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
	String expectedtitle="actiTIME - Enter Time-Track";
	wait.until(ExpectedConditions.titleIs(expectedtitle));
	
	String actualtitle=	driver.getTitle();
	System.out.println("Actual Title: "+actualtitle);
	
	if(actualtitle.equals(expectedtitle))
	{
		System.out.println("True");
	}
	else
	{
		System.out.println("False");
	}
	System.out.println("Expected Title: "+expectedtitle);
	
}

}
