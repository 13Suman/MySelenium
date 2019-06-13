package SeleniumPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotWay1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./exe files/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.seleniumhq.org/");
	    
	         TakesScreenshot  ts = (TakesScreenshot) driver;
	                      File srcFile = ts.getScreenshotAs(OutputType.FILE);    
	                      File destFile = new File("./screenshots/firstshot.png");
	                      
	    try {
	    	Files.copy(srcFile, destFile);
	    }
	    catch(IOException e)
	    {
	    	e.printStackTrace();
	    }
	

	}

}
