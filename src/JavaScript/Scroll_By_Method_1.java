package JavaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_By_Method_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");

		driver.get("https://www.naukri.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//ChromeDriver jse= new ChromeDriver() ;
		jse.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);
	  jse.executeScript("window.scrollBy(200,0)");
		Thread.sleep(2000);
	}

}
