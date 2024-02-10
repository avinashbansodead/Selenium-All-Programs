package Methods_Of_WebDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowdHandles {
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		System.out.println("Driver Registerded Sucefully");
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.findElement(By.id("newWindowsBtn")).click();
		Set<String> window=driver.getWindowHandles();
		System.out.println("Window : "+window);
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}
	}


