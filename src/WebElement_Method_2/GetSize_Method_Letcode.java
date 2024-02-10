package WebElement_Method_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize_Method_Letcode 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://letcode.in/test");	
    Dimension button1=driver.findElement(By.xpath("//a[text()='Sign up']")).getSize();
    System.out.println("Width and Height of button:"+button1);
    
	int width1 = button1.getWidth();
	int height1 = button1.getHeight();
	System.out.println("Width of button: "+width1);
	System.out.println("Height of button: "+height1);
	
	Dimension button2=driver.findElement(By.xpath("//a[text()='Log in']")).getSize();
	System.out.println("Width and Height of button:"+button2);
	
	int width2 = button2.getWidth();
	int height2 = button2.getHeight();
	System.out.println("Width of button2: "+width2);
	System.out.println("Height of button2: "+height2);
	
	
}
}
