package packageTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	@BeforeMethod
	@Parameters({"browser" , "baseurl"})
	public void preCondition (String browserName , String url) {
		System.out.println(browserName+","+url);
	}
	
	
  @Test
  public void sample() {
	  System.out.println("sample script");
  }
}
