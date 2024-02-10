package Methods_Of_WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl 
{
public static void main(String[] args) 
{
	ChromeDriver driver=new ChromeDriver();
	
	System.out.println("Driver Registerded Sucefully");
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	String url=driver.getCurrentUrl();
	System.out.println("Url: "+url);
}
}


