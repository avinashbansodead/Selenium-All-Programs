package WebElement_Method_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_Method_ActiTime 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");	
		
		boolean ele=driver.findElement(By.id("username")).isDisplayed();
		System.out.println(ele);
		
		boolean ele1=driver.findElement(By.xpath("//div[text()='Request Login Info']")).isDisplayed();
		System.out.println(ele1);
		
		

}
}
