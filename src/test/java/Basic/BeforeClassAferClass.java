



package Basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeClassAferClass 
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
@AfterClass
public void afterClass()
{
	System.out.println("End");
}
@BeforeClass
public void beforeClass()
{
	System.out.println("Start");
}
}

