package JavaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Method {

	public static void main(String[] args) 
	
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//ChromeDriver jse= new ChromeDriver() ;
		jse.executeScript("window.alert('Good morning')");
	}

}
