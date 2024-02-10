package WebElement_Method_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCss_Method_ActiTime {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");	
	    String ele=driver.findElement(By.id("username")).getCssValue("font-family");
		System.out.println(ele);
		
		String ele1=driver.findElement(By.id("username")).getCssValue("display");
		System.out.println(ele1);
		
	
	}		
		
}

