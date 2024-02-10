package WebElement_Method_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_Method {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");	
		Thread.sleep(2000);
	    String ele=driver.findElement(By.id("userCredentialsUsername")).getText();
		System.out.println(ele);
		
		String ele1=driver.findElement(By.xpath("//td[@id='adminCredentialsHeader']/following::b")).getText();
		System.out.println(ele1);
		
}
}

