package WebElement_Method_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetReact_Method_Vtiger 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");	
		
				Rectangle rect=driver.findElement(By.xpath("//button[text()='Sign in']")).getRect();
				
				int width = rect.getWidth();
				int height = rect.getHeight();
				
				int x = rect.getX();
				int y = rect.getY();
				
				System.out.println("Width of button: "+width);
				System.out.println("Height of button: "+height);
				
				System.out.println("Button X-start location: "+x);
				System.out.println("Button Y-start location: "+y);
				
	}

}
