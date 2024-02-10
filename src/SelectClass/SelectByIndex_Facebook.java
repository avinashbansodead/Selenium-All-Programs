package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex_Facebook {
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/signup");
		WebElement dropdown = driver.findElement(By.id("month"));
		
		Select s=new Select(dropdown);
		List<WebElement> ele=s.getOptions();
		//s.selectByIndex(0);
		//for(int i=0;i<=11;i++)
		for(int i=0;i<ele.size();i++)
		{
		s.selectByIndex(i);
}
}
}