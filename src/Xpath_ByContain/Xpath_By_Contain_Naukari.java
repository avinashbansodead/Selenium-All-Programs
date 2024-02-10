package Xpath_ByContain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Contain_Naukari 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		System.out.println("Driver Registerded Sucefully");
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your active Email ID')]")).sendKeys("raju@gmail.com");
				
	}
	}