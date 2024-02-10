package Xpath_ByAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSerchTexBox_From_GoogleSearchButton {

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");	
		Thread.sleep(3000);
		
		  driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']/parent::*/parent::*/parent::*/div[1]")).click();
		  Thread.sleep(3000);
		 
			System.out.println("aa");
	}

}
