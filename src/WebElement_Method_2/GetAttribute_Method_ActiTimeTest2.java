package WebElement_Method_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_Method_ActiTimeTest2 {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");	
		String ele=driver.findElement(By.id("username")).getAttribute("value");
		
		if(ele.isEmpty())
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}

}
}