package JavaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTo_Horizontally {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(document.body.scrollWidth,0)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(-document.body.scrollWidth,0)");
		Thread.sleep(2000);
	}

}
