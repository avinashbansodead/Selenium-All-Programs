package Methods_Of_WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver=new ChromeDriver();
	
	
	System.out.println("Driver Registerded Sucefully");
	driver.get("https://www.facebook.com/");
	System.out.println("Facebook window displayed");
	Thread.sleep(2000);
	driver.get("https://www.instagram.com/");
	System.out.println("Instagram window displayed");
	driver.navigate().back();
	Thread.sleep(2000);
	System.out.println("Facebook window will be displayed");
	driver.navigate().forward();
	System.out.println("Instagram window displayed");
	Thread.sleep(2000);
	driver.navigate().refresh();
	System.out.println("Facebook page will be displayed");
	Thread.sleep(2000);
	
	driver.navigate().to("https://www.instagram.com/\"");
	System.out.println("Instagram window displayed");
	Thread.sleep(2000);
	
	driver.navigate().refresh();
	System.out.println("Instagram will be displayed");
	Thread.sleep(2000);
}
}

