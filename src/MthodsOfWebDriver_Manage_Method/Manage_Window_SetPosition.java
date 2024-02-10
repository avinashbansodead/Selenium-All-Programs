package MthodsOfWebDriver_Manage_Method;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
public class Manage_Window_SetPosition 
{
	public static void main(String[] args) 
	{
		 
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Point p=new Point(20,40);
		driver.manage().window().setPosition(p);
		
		
	     System.out.println(" Facebook Window Position are set");
	     System.out.println("========================");
			System.out.println();
		
		driver.get("https://www.google.com/");
		
		Point p1=new Point(30,75);
		driver.manage().window().setPosition(p1);
		System.out.println("Google Window Position are set");
		System.out.println("========================");
		System.out.println();
		
        driver.get("https://www.instagram.com/");
        Point p2=new Point(-40,-38);
		driver.manage().window().setPosition(p2);
		System.out.println("Instagram Window Position are set");
		System.out.println("========================");
		System.out.println();
		
		driver.get("https://www.twitter.com/");
		Point p3=new Point(120,50);
		driver.manage().window().setPosition(p3);
		System.out.println("Twitterr Window Position are set");
		System.out.println("========================");
		System.out.println();
		
		
		
}
}
