package SeleniumPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	public static WebDriver launch (String browserName)
	
	{
		WebDriver driver =null;
		 
		if (browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./exe files/chromedriver.exe");
			
			driver =new ChromeDriver();
			
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./exe files/geckodriver.exe");
			
			driver =new FirefoxDriver();
			
		}
		return driver;
	}
}

	