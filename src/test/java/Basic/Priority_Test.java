package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Priority_Test
{
	@Test(priority =1 )
	public void swiggy()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
	}
	
@Test(priority =3 )

public void facebbok()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
	@Test(priority =2 )
	public void acti()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actitime.com/login.do");
	}

}