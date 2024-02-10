package Xpath_ByText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_ByText_Letcode {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		System.out.println("Driver Registerded Sucefully");
		driver.manage().window().maximize();
		driver.get("https://letcode.in/signup");
		
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys("Avinash Dattatray Bansode");
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("avinashbansodead@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("Avi@1234");
		Thread.sleep(2000);
		
		driver.findElement(By.id("agree")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='SIGN UP']")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
	}
}
