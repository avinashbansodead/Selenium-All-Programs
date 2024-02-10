package WebElement_Method_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_Method_ASSIGNMENT {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		driver.findElement(By.linkText("Toggle")).click();
		Thread.sleep(2500);
		
		boolean button1 = driver.findElement(By.id("yes")).isEnabled();
		System.out.println(button1);
		boolean button2 = driver.findElement(By.id("no")).isEnabled();
		System.out.println(button2);
		
		
		boolean button3 = driver.findElement(By.id("one")).isEnabled();
		System.out.println(button3);
		boolean button4 = driver.findElement(By.id("two")).isEnabled();
		System.out.println(button4);
		
		
		boolean button5 = driver.findElement(By.id("nobug")).isEnabled();
		System.out.println(button5);
		boolean button6 = driver.findElement(By.id("bug")).isEnabled();
		System.out.println(button6);
		
		
		boolean button7 = driver.findElement(By.id("foo")).isEnabled();
		System.out.println(button7);
		boolean button8 = driver.findElement(By.id("notfoo")).isEnabled();
		System.out.println(button8);
		
		
		boolean button9 = driver.findElement(By.id("going")).isEnabled();
		System.out.println(button9);
		boolean button10 = driver.findElement(By.id("notG")).isEnabled();
		System.out.println(button10);
		boolean button11 = driver.findElement(By.id("maybe")).isEnabled();
		System.out.println(button11);
		
		boolean button12 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isEnabled();
		System.out.println(button12);
		
		boolean button13 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isEnabled();
		System.out.println(button13);
		
    }

}
