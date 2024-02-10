package Basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod_Test 
{
@Test
public void createaccount()
{
	Assert.assertEquals("Pune", "Pune");
	System.out.println("Account is created");
}
@Test(dependsOnMethods = "editaccount")
public void deleteaccount()
{
	System.out.println("Account is deleted");
}
@Test(dependsOnMethods = "createaccount")
public void editaccount()
{
	System.out.println("Account is edited");
}
}
