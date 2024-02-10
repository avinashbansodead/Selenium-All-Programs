package WebElement_Method_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable_Method_1 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://letcode.in/test");
	Thread.sleep(2500);
	
	boolean ele=driver.findElement(By.xpath("//p[text()=' Button ']")).isEnabled();
	System.out.println(ele);
	
	boolean ele1=driver.findElement(By.xpath("//h1[text()=' Practice and become pro in test automation']")).isEnabled();
	System.out.println(ele1);
	/*driver.findElement(By.linkText("Drop-Down")).click();
	
	Thread.sleep(2500);
	boolean ele=driver.findElement(By.id("lang")).isEnabled();
	System.out.println(ele);
	Thread.sleep(2500);
	
	boolean ele1=driver.findElement(By.id("fruits")).isEnabled();
	System.out.println(ele1);*/
	
	
	
}
}


