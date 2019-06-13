package packageTest;

import org.testng.annotations.Test;

public class SampleTest {
  @Test(priority=1)
  public void Sample() {
  
	  System.out.println("sample");
  }
  @Test(priority=3)
  public void demo()
  {
	  System.out.println("demo");
  }
  @Test(priority=2)
  public void dummy()
  {
	  System.out.println("dummy");
  }
}
