package Execution_Type;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser 
{
	public WebDriver driver;
	@Parameters("Browser")
	@Test
	public void acti(String Browser)
	{
		if(Browser.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(Browser.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(Browser.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		
		else
		{
			driver=new ChromeDriver();
		}
		driver.get("https://www.instagram.com/");
	}
	
}
