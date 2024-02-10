package WebElement_Method_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable_Method_Oracle {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
		
		Thread.sleep(2500);
		driver.findElement(By.linkText("jdk-8u202-linux-arm32-vfp-hflt.tar.gz")).click();
		Thread.sleep(2500);
		boolean ele=driver.findElement(By.xpath("(//div[@class='obttns'])[3]")).isEnabled();
		Thread.sleep(2500);
		System.out.println(ele);

}
}
