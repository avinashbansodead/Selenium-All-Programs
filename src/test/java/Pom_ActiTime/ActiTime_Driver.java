package Pom_ActiTime;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_Driver {
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		
		
		
		LoginPage lp=new LoginPage(driver);
		lp.Login("admin","manager");
		
		/*PageFactory.initElements(driver, lp)
		 lp.getUser().sendKeys("Pune");
		driver.navigate().refresh();
		lp.getUser().sendKeys("admin");
		lp.getPassword().sendKeys("manager");
		lp.getLoginbutton().click();*/
		
		HomePage hp=new HomePage(driver);
		hp.home();
		//PageFactory.initElements(driver, hp);
		//hp.getLogoutbutton().click();
	}

}
