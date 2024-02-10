package FindElement_FindElementsI_By_TagName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_By_TagName 
	{
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://omayo.blogspot.com/");
			WebElement element=driver.findElement(By.tagName("button"));
			String button = element.getText();
			System.out.println("Button Name: "+button);
}
	}
