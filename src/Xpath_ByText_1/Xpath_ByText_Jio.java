package Xpath_ByText_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_ByText_Jio {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		System.out.println("Driver Registerded Sucefully");
		driver.manage().window().maximize();
		driver.get("https://www.jio.com/");
		
		driver.findElement(By.xpath("//a[text()='Mobile']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='True 5G']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='JioFiber']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Business']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Shop']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Apps']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Support']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		

}
}