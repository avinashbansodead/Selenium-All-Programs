package IrtcFixedAndDynamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuddistTrainAndEmail 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
	System.out.println("Driver Registerded Sucefully");
	driver.manage().window().maximize();
	driver.get("https://irctc.com/contact.html");
	driver.findElement(By.cssSelector("a[aria-controls='collapse-9']")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath("//td[text()='Buddhist train']/..//td[@data-title='mail']")).click();
	Thread.sleep(2000);
	
	
}
}
