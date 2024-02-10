package WebElement_Method_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_ActiveElement_Method {

public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.name("username")).sendKeys("Admin"+Keys.TAB);
	Thread.sleep(2000);
	WebElement ele = driver.switchTo().activeElement();
	ele.sendKeys("admin123");
	Thread.sleep(2000);
	ele.sendKeys(Keys.ENTER);

}
}
