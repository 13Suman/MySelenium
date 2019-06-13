package packageTest;

import org.testng.annotations.Test;

public class DemoTest {
  @Test(dataProviderClass=ConfigData.class, dataProvider="getData")
  
  public void dataTest(String firstData, String secondData)
  {
	  System.out.println(firstData+", "+secondData);
  }
  @Test
  public void demo()
  {
	  System.out.println("demo script");
  }
}
