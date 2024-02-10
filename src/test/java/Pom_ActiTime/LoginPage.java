package Pom_ActiTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
public WebDriver driver;
	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement loginbutton;
	
	public LoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public HomePage Login(String userdata,String passworddata)
	{
		user.sendKeys(userdata);
		password.sendKeys(passworddata);
		loginbutton.click();
		
		return new HomePage(driver);
	}
	
	
	

	public WebElement getUser() {
		return user;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	


}
