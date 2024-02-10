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

public class GetScreenshotAs_WebElement_ActiTime {
	public static void main(String[] args) throws IOException {
		
	
	LocalDateTime ldt=LocalDateTime.now();
	String timestamp = ldt.toString().replace(":", "-");
	
	System.out.println(timestamp);
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement box=driver.findElement(By.id("loginButton"));
	
	File ele=box.getScreenshotAs(OutputType.FILE);
	
	File dest=new File("./Element/Actitime"+timestamp+".png");
	FileUtils.copyFile(ele, dest);
	
}
}
