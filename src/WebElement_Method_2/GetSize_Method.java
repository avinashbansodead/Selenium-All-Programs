package WebElement_Method_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize_Method 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");	
		Dimension button=driver.findElement(By.xpath("//button[text()='Sign in']")).getSize();
		System.out.println("Width and Height of button:"+button);
		int width = button.getWidth();
		int height = button.getHeight();
		
		System.out.println("Width of button: "+width);
		
		System.out.println("Height of button: "+height);
		
		
	
		
		
	}
}
