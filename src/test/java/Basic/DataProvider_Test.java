package Basic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Test {
	
@Test(dataProvider="LoginData")
	public void loginTest(String email)
	{
		System.out.println(email+" ");
	}

	@DataProvider(name="LoginData")
	public Object[] getData()
	{
		Object[] data= {"abc@gmail.com","xyz@gmail.com"};
				return data;
	}
}
