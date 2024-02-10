package WebElement_Method_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_Method_ActitimeTest1 {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");	
	    String ele=driver.findElement(By.id("username")).getAttribute("placeholder");
		System.out.println(ele);
		
	String ele1=driver.findElement(By.id("username")).getAttribute("type");
		System.out.println(ele1);		
		String ele2=driver.findElement(By.id("username")).getAttribute("value");
		System.out.println(ele2);
		
		
		
}
}
