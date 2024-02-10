package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_AssertTrue_Method1 {
	@Test
	public void acti()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement box = driver.findElement(By.id("keepLoggedInCheckBox"));
		//Assert.assertTrue(box.isDisplayed());
		Assert.assertTrue(box.isSelected());
		System.out.println("Good afternoon");
	}
	@Test
	public void facebook()
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	
		System.out.println("Facebook");
	}
}
