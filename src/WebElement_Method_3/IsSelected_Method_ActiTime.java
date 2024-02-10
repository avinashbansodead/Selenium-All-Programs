package WebElement_Method_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_Method_ActiTime 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");	
		
		//boolean ele=driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		//System.out.println(ele);
		
			WebElement ele=driver.findElement(By.id("keepLoggedInCheckBox"));
			if(ele.isSelected())
{
	System.out.println("TRUE");
	
}
			else
			{
				System.out.println("FALSE");
			}
ele.click();
if(ele.isSelected())
{
	System.out.println("TRUE");
}
else
{
	System.out.println("FALSE");
}
}
}
