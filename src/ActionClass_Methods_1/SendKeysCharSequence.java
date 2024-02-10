package ActionClass_Methods_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysCharSequence 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Actions a= new Actions(driver);
		a.sendKeys( Keys.PAGE_DOWN);
		Thread.sleep(2000);
		a.sendKeys( Keys.PAGE_DOWN);
		a.perform();

	}

}
