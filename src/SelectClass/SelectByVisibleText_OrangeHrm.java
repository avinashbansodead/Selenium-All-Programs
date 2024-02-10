package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleText_OrangeHrm
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		WebElement country = driver.findElement(By.id("Form_getForm_Country"));
		
		Select s=new Select(country);
		//s.selectByVisibleText("Australia");

		List<WebElement>all=s.getOptions();
		for(WebElement c:all)
{
	s.selectByVisibleText(c.getText());
}
	}

}
