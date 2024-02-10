package XPath_Absolute_Corelative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Xpath_CoRelative_Text {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	System.out.println("Driver Registerded Sucefully");
	driver.manage().window().maximize();
	driver.get("https:/www.flipkart.com/");
	
	driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[1]/a/div[2]")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[2]/a/div[2]")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[3]/a/div[2]")).click();
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//div[4]/a/div[2]")).click();
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//div[5]/a/div[2]")).click();
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//div[6]/a/div[2]")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[7]/a/div[2]")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[8]/a/div[2]")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[9]/a/div[2]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[10]/a/div[2]")).click();
	Thread.sleep(2000);
	

}
}
