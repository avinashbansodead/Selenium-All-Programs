package Vtigercrm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigersendKeys {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Driver1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		System.out.println("Driver Registerded Sucefully");
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@class='app-icon fa fa-bars'])[1]")).click();
		Thread.sleep(2000);
		WebElement marketing = driver.findElement(By.xpath("//span[text()=' MARKETING']"));
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.moveToElement(marketing).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()=' Organizations'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_listView_basicAction_LBL_ADD_RECORD")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("Myntra");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_phone")).sendKeys("7975489613");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_fax")).sendKeys("12345678");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_otherphone")).sendKeys("7875489615");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_email1")).sendKeys("abc2GMAIL.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_ownership")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_siccode")).sendKeys("41454789");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_annual_revenue")).sendKeys("450000");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_website")).sendKeys("www.mynta.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_tickersymbol")).sendKeys("yes");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_employees")).sendKeys("487");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_email2")).sendKeys("xyz@gmail.com");
		
		
		
		
		
		
		
		
		

}
}
