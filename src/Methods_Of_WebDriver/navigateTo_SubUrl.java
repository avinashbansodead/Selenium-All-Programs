package Methods_Of_WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigateTo_SubUrl {
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		System.out.println("Driver Registerded Sucefully");
		driver.manage().window().maximize();
		driver.navigate().to("https://licindia.in/Products/Pension-Plans");
	}
	}
