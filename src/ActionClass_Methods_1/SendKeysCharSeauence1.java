package ActionClass_Methods_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysCharSeauence1 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement button = driver.findElement(By.id("loginButton"));
		Actions a= new Actions(driver);
		a.sendKeys(button, Keys.ENTER);
		a.perform();
	}

}
