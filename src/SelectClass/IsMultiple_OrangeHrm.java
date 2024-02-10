package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple_OrangeHrm {
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		WebElement country = driver.findElement(By.id("Form_getForm_Country"));
		
		Select s=new Select(country);
		if(s.isMultiple())
		{
			System.out.println("True(It is a multiple list dropdown)");
		}
		else
		{
			System.out.println("False(It  is a single list dropdown)");
		}
}
}