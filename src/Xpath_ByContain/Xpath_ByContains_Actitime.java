package Xpath_ByContain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_ByContains_Actitime{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		System.out.println("Driver Registerded Sucefully");
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).click();
		

}
}
