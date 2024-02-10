package JavaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTo_Vertically {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		jse.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(2000);
	}

}
