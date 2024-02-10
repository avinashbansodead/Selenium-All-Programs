package WebElement_Method_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod_ForFullScreen 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.get("https://commons.wikimedia.org/wiki/File:Google_%22G%22_Logo.svg#/media/File:Google_%22G%22_Logo.svg");
		 Thread.sleep(2000);
		 
			
			driver.findElement(By.cssSelector("button[class='mw-mmv-fullscreen']")).click();
			Thread.sleep(2000);
	}

}
