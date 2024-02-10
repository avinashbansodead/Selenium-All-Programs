package ActionClass_Methods_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_To_Element_Method 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.flipkart.com/");
		  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		  WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
		  Actions a= new Actions(driver);
		  a.moveToElement(fashion);
		a.perform();
	}

}
