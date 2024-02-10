
package WebElement_Method_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElement_Excepation  
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/doodles");
		Thread.sleep(9000);
		driver.findElement(By.linkText("Mother’s Day (May 07)")).click();
		//(The targeted element is very away from the window on the bottom of the web page then exception occur NosuchElementException)
		
		 }	

}

