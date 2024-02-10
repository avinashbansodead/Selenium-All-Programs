package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenshotAs_Method_ActiTime
{
	public static void main(String[] args) throws IOException 
	{
		LocalDateTime ldt=LocalDateTime.now();
		String timestamp = ldt.toString().replace(":", "-");
		//System.out.println(ldt);
		System.out.println(timestamp);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement box=driver.findElement(By.id("keepLoggedInCheckBox"));
		
		File ele=box.getScreenshotAs(OutputType.FILE);
		File dest=new File("./pune/actitime"+timestamp+".png");
		FileUtils.copyFile(ele, dest);
		
	}
}
