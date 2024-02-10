package ActionClass_Methods_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_To_Element_Method_Including_Offset {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		
		WebElement target = driver.findElement(By.linkText("Pricing"));
		Actions a= new Actions(driver);
		a.moveToElement(target, 100, 0);
		
		Thread.sleep(2000);
		a.moveToElement(target, -100, 0);
		a.perform();
	}

}
