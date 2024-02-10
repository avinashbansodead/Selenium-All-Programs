
package JavaScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableMethd_Click_Method {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
			
			driver.findElement(By.linkText("jdk-8u202-linux-arm32-vfp-hflt.tar.gz")).click();
			WebElement button = driver.findElement(By.linkText("Download jdk-8u202-linux-arm32-vfp-hflt.tar.gz"));
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			//ChromeDriver jse= new ChromeDriver() ;
			jse.executeScript("arguments[0].click()", button);
	}
		}


