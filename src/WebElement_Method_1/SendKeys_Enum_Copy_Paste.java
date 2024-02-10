package WebElement_Method_1;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class SendKeys_Enum_Copy_Paste {

	
	
	    public static void main(String[] args) throws InterruptedException 
	    {   
	        
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.actitime.com/login.do");
	        Thread.sleep(2000);
	        driver.findElement(By.id("username")).sendKeys("kodingwindow");
	        Thread.sleep(2000);
	        driver.findElement(By.id("username")).sendKeys(Keys.CONTROL, "a");
	        Thread.sleep(2000);
	        driver.findElement(By.id("username")).sendKeys(Keys.CONTROL, "c");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.id("username")).sendKeys(Keys.ARROW_RIGHT,Keys.CONTROL, "v" );
	        Thread.sleep(2000);
	       
	        
			
	    }
	}

	


