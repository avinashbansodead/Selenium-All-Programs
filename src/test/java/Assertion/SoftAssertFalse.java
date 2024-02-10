package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertFalse 
{
	SoftAssert s=new SoftAssert();
	@Test
	public void acti()
	{
WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement box = driver.findElement(By.id("keepLoggedInCheckBox"));
	s.assertFalse(box.isDisplayed());
	//s.assertFalse(box.isSelected());
	s.assertAll();
		System.out.println("Good afternoon");
	}
	@Test
	public void facebook()
	{
		System.out.println("Facebook");
	}
}

