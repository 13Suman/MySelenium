package SeleniumPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./exe files/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    EventFiringWebDriver efw = new EventFiringWebDriver(driver);
	                         File srcFile = efw.getScreenshotAs(OutputType.FILE);
	                               File destFile = new File("./screenshots/secondshot.png");
	                               
	                               try {
	                            	   Files.copy(srcFile, destFile);
	                               }
	                               catch(IOException e)
	                               {
	                            	   e.printStackTrace();
	                               }

	}

}
