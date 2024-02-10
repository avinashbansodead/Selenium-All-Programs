
package WebElement_Method_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClickIntecepted_Exception 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://flipkart.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='Top Offers']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
			Thread.sleep(2000);
		 
		//(ElementClickInterceptedException occurs because the targeted element is covered by other window)
	
		
	}	

}
