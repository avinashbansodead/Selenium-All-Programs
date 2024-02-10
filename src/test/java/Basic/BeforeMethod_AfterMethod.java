package Basic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethod_AfterMethod 
{
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Login");
	}
@Test

	public void acti()
	{
		System.out.println("Actitime");
	}
@AfterMethod
public void afterMethod()
{
	System.out.println("Logout");
}
@Test
public void facebok()
{
	System.out.println("Facebook");
}
@Test
public void Instagram()
{
	System.out.println("Instagram");
}
}

