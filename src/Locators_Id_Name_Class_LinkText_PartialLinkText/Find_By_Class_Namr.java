package Locators_Id_Name_Class_LinkText_PartialLinkText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_By_Class_Namr {
	public static void main (String [] args){	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.className("inputtext")).sendKeys("Software Testing Material");
		driver.findElement(By.className("_6ltg")).click();
	}
}
