package Methods_Of_WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		System.out.println("Driver Registerded Sucefully");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String ele=driver.getTitle();
		System.out.println("Title: "+ele);
		
		boolean Contain=ele.contains("Online Shopping Site for Mobiles");
		System.out.println(Contain);
	}
	}

