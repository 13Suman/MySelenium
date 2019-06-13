package packageTest;

import org.testng.annotations.DataProvider;

public class ConfigData {
	@DataProvider
	public static Object[][] getData()
			{
Object [][]	obj	=new Object[2][2];
obj[0][0]="Virat";
obj[0][1]="Kohli";

obj[1][0]="Sachin";
obj[1][1]="Tendulkar";
return obj;
	}

}
