package packageTest;

import org.testng.annotations.BeforeMethod;

public class ConfigMethod {

	@BeforeMethod
	public void preCondition() {
		System.out.println("Before Method");
	}
}
