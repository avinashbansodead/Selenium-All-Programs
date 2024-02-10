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

public class GetScreenshotAs_Method_WebElement_Naukari_Com {
public static void main(String[] args) throws IOException, InterruptedException {
		
		
		LocalDateTime ldt=LocalDateTime.now();
		String timestamp = ldt.toString().replace(":", "-");
		
		System.out.println(timestamp);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
driver.get("https://www.naukri.com/");
		
		
		
		WebElement box=driver.findElement(By.xpath("//a[text()='Register']"));
		
		File ele=box.getScreenshotAs(OutputType.FILE);
		
		

		
		File dest=new File("./Element/Naukari"+timestamp+".png");
		FileUtils.copyFile(ele, dest);
		
	}
}
