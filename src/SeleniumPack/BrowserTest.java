package SeleniumPack;

import org.openqa.selenium.WebDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		WebDriver driver= BrowserFactory.launch("firefox");
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");

	}

}
