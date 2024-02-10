package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_AssertFalse_Method {


	@Test
	public void acti()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement box = driver.findElement(By.id("keepLoggedInCheckBox"));
		Assert.assertFalse(box.isDisplayed());
		//Assert.assertFalse(box.isSelected());
		System.out.println("Good afternoon");
	}
	@Test
	public void facebook()
	{
		System.out.println("Facebook");
	}
}
/* False assert requiere falses condition.If the given condition is true then it will skip the test and 
 *   execute the remaing test */
 