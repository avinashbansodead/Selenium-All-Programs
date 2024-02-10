package FindByElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByElements_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).click();
		List<WebElement> auto = driver.findElements(By.xpath("//li[@role='presentation' and not(@id='YMXe' ) and not(@id='mitGyb')]"));
		for(WebElement a:auto)
		{
			System.out.println(a.getText());
			
		}
	}

}
