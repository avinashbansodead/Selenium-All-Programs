package Methods_Of_WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		System.out.println("Driver Registerded Sucefully");
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> window1=driver.getWindowHandles();
		System.out.println("Window : "+window1);
		driver.close();
		//driver.quit();
	}
	}



