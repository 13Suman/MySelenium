package packageTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupExecutionTest {
	@BeforeMethod(groups= {"Smoke"})
	public void preCondition() {
		System.out.println("Before Method");
	}
	
	@BeforeClass(groups= {"Regression"})
	public void tearDown()
	{
		System.out.println("Before class");
	}
	
  @Test (groups= {"Smoke"})
  public void login() {
	  System.out.println("login script");
  }
 @Test(groups= {"Regression"}) 
 public void createNewCustomer() {
	 System.out.println("New Customer");
 }
 
}
