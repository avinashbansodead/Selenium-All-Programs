package ActionClass_Methods_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Switch_To_Iframe {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		  driver.findElement(By.cssSelector("svg[class='gb_h']")).click();
		  driver.switchTo().frame("app");
		  driver.findElement(By.xpath("//span[text()='YouTube']")).click();
		 
		

}
}