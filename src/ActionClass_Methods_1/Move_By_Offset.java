package ActionClass_Methods_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_By_Offset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://www.actitime.com/");
			//WebElement button = driver.findElement(By.linkText("Log in"));
			//WebElement target = driver.findElement(By.linkText("Pricing"));
			Actions a= new Actions(driver);
			a.moveByOffset(100, 100).contextClick();
			
			
			a.perform();
		
			
	}

}
