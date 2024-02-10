package Locators_Id_Name_Class_LinkText_PartialLinkText;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PatialLinkedText {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		System.out.println("Driver Registerded Sucefully");
		driver.manage().window().maximize();
		driver.get("https:/www.jio.com/");
		
		driver.findElement(By.partialLinkText("Mob")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("True")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("JioFi")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Busin")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Sh")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Ap")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Supp")).click();
		
		
		
		
		
	}
	}



