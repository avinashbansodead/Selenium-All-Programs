package Pom_OrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

		public WebDriver driver;
	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")	
	WebElement dropdown;
		
	@FindBy(linkText ="Logout")
	private WebElement logoutbutton;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public LoginPage home()
	{
	dropdown.click();
	logoutbutton.click();
	return new LoginPage(driver);
	}

	public WebElement getLogoutbutton1() {
		return dropdown;
	}
	public WebElement getLogoutbutton2() {
		return logoutbutton;
	}
	
	

	}


