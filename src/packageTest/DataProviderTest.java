package packageTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
  @DataProvider(name="WorldCup")
  public Object[][] getData(){
	 Object[][] obj=new Object [3][2];
	 
	 obj[0][0]="Virat";
	 obj[0][1]="Kohli";
	 
	 obj[1][0]="Sachin";
	 obj[1][1]="Tendulkar";
	 
	 obj[2][0]="M.S";
	 obj[2][1]="Dhoni";
	   return obj;
  }
  @Test(dataProvider="WorldCup")
  public void dataTest(String firstData, String secondData)
  {
	  System.out.println(firstData+" "+secondData);
  }
}