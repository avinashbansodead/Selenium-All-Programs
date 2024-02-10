package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BirthDateSelectByVisibleFacebbok {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/signup");
		WebElement dropdown = driver.findElement(By.id("day"));
		
		Select s=new Select(dropdown);
		s.selectByVisibleText("12");
		
WebElement dropdown1 = driver.findElement(By.id("month"));
		
		Select s1=new Select(dropdown1);
		s1.selectByVisibleText("Oct");
		
WebElement dropdown2 = driver.findElement(By.id("year"));
		
		Select s2=new Select(dropdown2);
		s2.selectByVisibleText("1998");
	}

}
