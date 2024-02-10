package Pom_OrangeHrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
public WebDriver driver;

	@FindBy(name="username")
	private WebElement user;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(css = "button[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	private WebElement loginbutton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);//lp object
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
