package MthodsOfWebDriver_Manage_Method;

import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Maximize_Minimize_FullScreen 
{

	public static void main(String[] args) 
	{
		 
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("Window gets maximized");
		
		driver.manage().window().minimize();
		System.out.println("Window gets minimized");
		
		driver.manage().window().fullscreen();
		System.out.println("Full screen will be displayed");
		

	}

}
