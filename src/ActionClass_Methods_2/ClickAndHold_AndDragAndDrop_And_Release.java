package ActionClass_Methods_2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ClickAndHold_AndDragAndDrop_And_Release {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement source = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		 WebElement target = driver.findElement(By.id("column-3"));
		Actions a= new Actions(driver);
		//a.dragAndDrop(source, target);
		a.clickAndHold(source).moveToElement(target).release();
		a.perform();
		a.build();
	}

}
