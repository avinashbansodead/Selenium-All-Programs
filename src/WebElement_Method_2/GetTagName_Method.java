package WebElement_Method_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName_Method {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");	
		Thread.sleep(2000);
		String ele=driver.findElement(By.id("keepLoggedInCheckBox")).getTagName();
		String ele1=driver.findElement(By.xpath("//div[text()='Login ']")).getTagName();
		String ele2=driver.findElement(By.xpath("//*[text()='Login ']")).getTagName();
		Thread.sleep(2000);
		System.out.println(ele);
		Thread.sleep(2000);
		
		System.out.println(ele1);
		Thread.sleep(2000);
		
		System.out.println(ele2);
		Thread.sleep(2000);
		

}
}
