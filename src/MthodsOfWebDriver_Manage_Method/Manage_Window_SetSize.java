package MthodsOfWebDriver_Manage_Method;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
public class Manage_Window_SetSize 
{

	public static void main(String[] args) 
	{
		 
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Dimension dimension=new Dimension(200,100);
		driver.manage().window().setSize(dimension);
	    
		System.out.println(" Facebook Window dimensions are set");
	    System.out.println("========================");
		System.out.println();
		
		
		driver.get("https://www.google.com/");
		Dimension dimension1=new Dimension(500,600);
		driver.manage().window().setSize(dimension1);
		System.out.println("Google Window dimensions are set");
		System.out.println("========================");
		System.out.println();
		
        driver.get("https://www.instagram.com/");
        Dimension dimension2=new Dimension(1000,700);
		driver.manage().window().setSize(dimension2);
		System.out.println("Instagram Window dimensions are set");
		System.out.println("========================");
		System.out.println();
		
		driver.get("https://www.twitter.com/");
		Dimension dimension3=new Dimension(700,300);
		driver.manage().window().setSize(dimension3);
		System.out.println("Twitterr Window dimensions are set");
		System.out.println("========================");
		System.out.println();
		
		
		
}
}