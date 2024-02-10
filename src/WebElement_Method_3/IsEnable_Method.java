package WebElement_Method_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable_Method 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://letcode.in/test");
	driver.findElement(By.linkText("Edit")).click();
	
	Thread.sleep(2500);
	boolean ele=driver.findElement(By.id("fullName")).isEnabled();
	System.out.println(ele);
	Thread.sleep(2500);
	
	boolean ele1=driver.findElement(By.id("noEdit")).isEnabled();
	System.out.println(ele1);
	
	
	
}
}

