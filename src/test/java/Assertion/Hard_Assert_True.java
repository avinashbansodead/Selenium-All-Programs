package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_True {
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
		System.out.println("Facebook");
	}
}
/*True assert requier true condition and if the condition is false then it will skip the test and 
excute the remaing test */

