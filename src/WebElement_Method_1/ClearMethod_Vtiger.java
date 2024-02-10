package WebElement_Method_1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod_Vtiger 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");	
		/*driver.findElement(By.id("username")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("Avinash");
		Thread.sleep(2000);*/
		
		WebElement ele=driver.findElement(By.id("username"));
		ele.clear();
		Thread.sleep(2000);
		ele.sendKeys("Avinash Bansode");
		
		//when target element on performing  more than one action then object is created 
		//for perfroming n no of send keys methdo
		
}
}
