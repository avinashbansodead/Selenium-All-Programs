package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {
	SoftAssert s=new SoftAssert();
	@Test
	public void acti()
	{
WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement box = driver.findElement(By.id("keepLoggedInCheckBox"));
	//s.assertTrue(box.isDisplayed());
	s.assertTrue(box.isSelected());
	s.assertAll();
		System.out.println("Good afternoon");
		
		
		
}
	SoftAssert s1=new SoftAssert();
	@Test
	public void facebook()
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		s1.assertEquals("Pune", "Pune");
		s1.assertAll();
		System.out.println("Facebook");
		
	
}
}