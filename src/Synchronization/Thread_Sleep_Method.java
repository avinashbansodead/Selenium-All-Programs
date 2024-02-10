package Synchronization;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thread_Sleep_Method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Driver1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		System.out.println("Driver Registerded Sucefully");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https:/www.flipkart.com/");
		
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("img[alt='Top Offers']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("img[alt='Mobiles & Tablets']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("img[alt='Electronics']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("img[alt='TVs & Appliances']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("img[alt='Fashion']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("img[alt='Beauty']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("img[alt='Home & Kitchen']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("img[alt='Furniture']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("img[alt='Flights']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("img[alt='Grocery']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(4000);
		System.out.println("Software is checked sucefully");
		

}
}
