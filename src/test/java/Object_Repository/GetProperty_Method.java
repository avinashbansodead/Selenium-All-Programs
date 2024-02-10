package Object_Repository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetProperty_Method 
{

	public static void main(String[] args) throws IOException
	{
	WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		
 FileInputStream fis=new FileInputStream("src\\test\\resources\\file1.properties");
 Properties p=new Properties();
p.load(fis);
String url= p.getProperty("url");
String user=p.getProperty("user");
String word=p.getProperty("password");
driver.get(url);
driver.findElement(By.id("username")).sendKeys(user);
driver.findElement(By.name("pwd")).sendKeys(word);



	}

}
