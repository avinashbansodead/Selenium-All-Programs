package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchonization_1 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Driver1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");

	driver.findElement(By.id("loginButton")).click();
	//Thread.sleep(3000);
	String expectedtitle="actiTIME - Enter Time-Track";
	String actualtitle=	driver.getTitle();
	System.out.println(actualtitle);
	
	if(actualtitle.equals(expectedtitle))
	{
		System.out.println("True");
	}
	else
	{
		System.out.println("False");
	}
	System.out.println(expectedtitle);
	
}

}
