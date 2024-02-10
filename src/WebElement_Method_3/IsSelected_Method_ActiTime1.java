package WebElement_Method_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_Method_ActiTime1 {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");	
		Thread.sleep(2000);
		 WebElement ele = driver.findElement(By.id("username"));
		 Thread.sleep(2000);
		boolean a = ele.isSelected();
		Thread.sleep(2000);
		 System.out.println(a);
		 
		 boolean a1 = ele.isEnabled();
			Thread.sleep(2000);
			 System.out.println(a1);
			 
		 ele.click();
		 
		 Thread.sleep(2000);
         boolean b = ele.isSelected();
         Thread.sleep(2000);
		System.out.println(b);
		
		Thread.sleep(2000);
        boolean b1 = ele.isEnabled();
        Thread.sleep(2000);
        System.out.println(b1);
}
}
