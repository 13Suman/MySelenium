package packageTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ConfigClass {
	@BeforeClass
	  public void setUp() {
		  System.out.println("Before class");
	  }

	  @AfterClass
	  public void tearDown() {
		  System.out.println("After class");
	  }


}
