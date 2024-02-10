package WebElement_Method_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_Method_Vtiger 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");	
		
				Point location=driver.findElement(By.xpath("//button[text()='Sign in']")).getLocation();
				int x = location.getX();
				int y = location.getY();
				
				System.out.println("Button X-start and Y-start location: "+location);
				System.out.println("Button X-start location: "+x);
				System.out.println("Button Y-start location: "+y);
	}
}
