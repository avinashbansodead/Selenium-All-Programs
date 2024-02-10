
package WebElement_Method_1;

   import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	public class IllegalArgument_Exception
	{
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");	
		    WebElement ele = driver.findElement(By.id("username"));
			ele.clear();
			ele.sendKeys(null);
			
			
			
	}
	}

