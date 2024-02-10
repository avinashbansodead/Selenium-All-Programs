package Methods_Of_WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		System.out.println("Driver Registerded Sucefully");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String source=driver.getPageSource();
		System.out.println("Source : "+source);
	}
	}
