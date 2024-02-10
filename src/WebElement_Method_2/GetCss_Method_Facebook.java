package WebElement_Method_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCss_Method_Facebook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");	
		Thread.sleep(2000);
		
		String ele=driver.findElement(By.xpath("//button[text()='Log in']")).getCssValue("border-radius");
		System.out.println(ele);
}
}
