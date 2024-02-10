package TakeScreenShotAssignmet;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenshotAs__Method_WebElement_Flipkart {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		LocalDateTime ldt=LocalDateTime.now();
		String timestamp = ldt.toString().replace(":", "-");
		
		System.out.println(timestamp);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.flipkart.com/");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		WebElement box=driver.findElement(By.cssSelector("img[alt='Grocery']"));
		
		File ele=box.getScreenshotAs(OutputType.FILE);
		
		

		
		File dest=new File("./Element/Flipkart"+timestamp+".png");
		FileUtils.copyFile(ele, dest);
		
	}
}
