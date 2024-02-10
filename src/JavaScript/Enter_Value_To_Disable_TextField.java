package JavaScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enter_Value_To_Disable_TextField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");
		//driver.findElement(By.id("noEdit")).sendKeys("Pune");
		WebElement text = driver.findElement(By.id("noEdit"));
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		//ChromeDriver jse= new ChromeDriver() ;
		
		jse.executeScript("arguments[0].value='Pune'", text);
	
	}

}
