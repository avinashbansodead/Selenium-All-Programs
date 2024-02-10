package MthodsOfWebDriver_Manage_Method;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_GetPosition 
{

	public static void main(String[] args) 
	{
		 
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Point position = driver.manage().window().getPosition();
		System.out.println("Window Position are displayed for Facebook Application");
		System.out.println("X-Position: "+position.getX());
		System.out.println("Y-Position: "+position.getY());
		System.out.println("X-Position&Y-Position: "+position);
		System.out.println("========================");
		System.out.println();
		
		driver.get("https://www.google.com/");
		driver.manage().window().minimize();
		Point position2 = driver.manage().window().getPosition();
		System.out.println("Window Position are displayed for Google Application");
		System.out.println("X-Position: "+position2.x);
		System.out.println("Y-Position: "+position2.y);
		System.out.println("X-Position&Y-Position: "+position2);
		System.out.println("========================");
		System.out.println();
		
        driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Point position1 = driver.manage().window().getPosition();
		System.out.println("Window Position are displayed for Instagram Application");
		System.out.println("X-Position: "+position1.x);
		System.out.println("Y-Position: "+position1.y);
		System.out.println("X-Position&Y-Position: "+position1);
		System.out.println("========================");
		System.out.println();
		
		driver.get("https://www.twitter.com/");
		driver.manage().window().fullscreen();
		Point position3 = driver.manage().window().getPosition();
		System.out.println("Window Position are displayed for Twitter Application");
		System.out.println("X-Position: "+position3.x);
		System.out.println("Y-Position: "+position3.y);
		System.out.println("X-Positiont&Y-Position: "+position3);
		System.out.println("========================");
		System.out.println();
		
		
		
}
}
