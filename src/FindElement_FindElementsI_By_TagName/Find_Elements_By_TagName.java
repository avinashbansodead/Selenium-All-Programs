package FindElement_FindElementsI_By_TagName;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Elements_By_TagName 
	{
		public static void main(String[] args) 
     {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://omayo.blogspot.com/");
			List<WebElement> elements=driver.findElements(By.tagName("button"));
			for (int i=1;i<elements.size();)
	     {
		         for(WebElement element:elements) 
			{
		         String button = element.getText();
		         System.out.println(i+":"+"Button Name=> "+button);
		         i++;	
			}	
			     break;
			
         }
      }
   }