package Pom_OrangeHrm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangehrmDriver 
{
public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		LoginPage lp=new LoginPage(driver);
		lp.Login("Admin","admin123");
		
		
		
		/*WebElement dropdown = driver.findElement(By.cssSelector("i[class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.moveToElement(dropdown).perform();*/

		
		HomePage hp=new HomePage(driver);
		hp.home();

	}

}
