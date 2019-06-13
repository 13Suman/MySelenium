package packageTest;

import org.testng.annotations.Test;

public class OldTest {
  @Test(invocationCount=10, invocationTimeOut=10000)
  public void dummy() {
       System.out.println("dummy");
  }
}
