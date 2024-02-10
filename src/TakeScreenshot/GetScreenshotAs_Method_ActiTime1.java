package TakeScreenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenshotAs_Method_ActiTime1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File ele=ts.getScreenshotAs(OutputType.FILE);
		System.out.println(ele.getAbsolutePath());
		
		
		File dest=new File("./Screenshot/actitime.png");
		ele.renameTo(dest);
		Thread.sleep(90000);
	}
}


