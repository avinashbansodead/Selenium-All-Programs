package Methods_Of_WebDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles1 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		
		System.out.println("Driver Registerded Sucefully");
		driver.get("https://www.facebook.com/");
		
		
		Set<String> window=driver.getWindowHandles();
		System.out.println("Window : "+window);
		String title = driver.getTitle();
		System.out.println(title);
		
		Iterator<String> w = window.iterator();
		String window1=w.next();
		String window2=w.next();
		
		
		driver.switchTo().window(window2);
		System.out.println(driver.getTitle());
	}

}
