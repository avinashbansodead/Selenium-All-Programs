package ActionClass_Methods_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		WebElement ele = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		driver.switchTo().frame(ele);
		
		 WebElement source = driver.findElement(By.id("draggable"));
	
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions a= new Actions(driver);
		
		a.dragAndDrop(source,target);
		a.perform();
	}

}
