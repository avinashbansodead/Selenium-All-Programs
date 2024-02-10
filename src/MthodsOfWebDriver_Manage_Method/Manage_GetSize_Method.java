package MthodsOfWebDriver_Manage_Method;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
public class Manage_GetSize_Method 
{

	public static void main(String[] args) 
	{
		 
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Dimension dimension = driver.manage().window().getSize();
		System.out.println("Window Dimesion are displayed for Facebook Application");
		System.out.println("Width: "+dimension.getWidth());
		System.out.println("Height: "+dimension.height);
		System.out.println("Weight&Height: "+dimension);
		System.out.println("========================");
		System.out.println();
		
		driver.get("https://www.google.com/");
		driver.manage().window().minimize();
		Dimension dimension2 = driver.manage().window().getSize();
		System.out.println("Window Dimesion are displayed for Google Application");
		System.out.println("Width: "+dimension2.width);
		System.out.println("Height: "+dimension2.height);
		System.out.println("Weight&Height: "+dimension2);
		System.out.println("========================");
		System.out.println();
		
        driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Dimension dimension1 = driver.manage().window().getSize();
		System.out.println("Window Dimesion are displayed for Instagram Application");
		System.out.println("Width: "+dimension1.width);
		System.out.println("Height: "+dimension1.height);
		System.out.println("Weight&Height: "+dimension1);
		System.out.println("========================");
		System.out.println();
		
		driver.get("https://www.twitter.com/");
		driver.manage().window().fullscreen();
		Dimension dimension3 = driver.manage().window().getSize();
		System.out.println("Window Dimesion are displayed for Twitter Application");
		System.out.println("Width: "+dimension3.width);
		System.out.println("Height: "+dimension3.height);
		System.out.println("Weight&Height: "+dimension3);
		System.out.println("========================");
		System.out.println();
		
		
		
}
}