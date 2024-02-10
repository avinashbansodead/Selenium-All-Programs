package TakeScreenShotAssignmet;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenshotAs_Method_Instagram {
	public static void main(String[] args) throws IOException {
		LocalDateTime ldt=LocalDateTime.now();
		String timestamp = ldt.toString().replace(":", "-");
		System.out.println(timestamp);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File ele=ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./Page/instagram"+timestamp+".png");
		FileUtils.copyFile(ele, dest);
		
	}
}
