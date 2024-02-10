package TakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenshotAs_Method_Facebook {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

TakesScreenshot ts=(TakesScreenshot) driver;
		//TakesScreenshot ts=new ChromeDriver();
		File ele=ts.getScreenshotAs(OutputType.FILE);
		System.out.println(ele.getAbsolutePath());
		
		
		File dest=new File("./Screenshot/facebook.png");
		ele.renameTo(dest);
		
		//File dest=new File("./pune/facebook.png");
		//FileUtils.copyFile(ele, dest);
		Thread.sleep(90000);
	}

}
