package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NormalExecution_Test
{
	@Test
	public void swiggy()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
	}
	
@Test

public void facebbok()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
	@Test
	public void acti()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actitime.com/login.do");
	}

}
