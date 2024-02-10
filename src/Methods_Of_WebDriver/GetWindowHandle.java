package Methods_Of_WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		System.out.println("Driver Registerded Sucefully");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String window=driver.getWindowHandle();
		System.out.println("Window : "+window);
	}
	}

