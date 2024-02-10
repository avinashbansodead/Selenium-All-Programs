package ActionClass_Methods_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_1 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/draggable/");
	 WebElement ele = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	 driver.switchTo().frame(ele);
	WebElement source = driver.findElement(By.xpath("//p[text()='Drag me around']"));
	
	Actions a= new Actions(driver);
	//a.dragAndDrop(source, target);/jqueryui.com/draggable/
	a.dragAndDropBy(source, 0, 100);
	a.perform();

}	
}
