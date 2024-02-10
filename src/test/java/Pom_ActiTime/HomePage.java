package Pom_ActiTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

		public WebDriver driver;
	@FindBy(id="logoutLink")
	private WebElement logoutbutton;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);//home object
	}
	public LoginPage home()
	{
	logoutbutton.click();
	return new LoginPage(driver);
	}

	public WebElement getLogoutbutton() {
		return logoutbutton;
	}
	
	

	}


