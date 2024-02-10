package WebElement_Method_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod_ActiTlnme 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");	
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("//div[text()='Login ']")).submit();
		//driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Login ']")).submit();
}
}
