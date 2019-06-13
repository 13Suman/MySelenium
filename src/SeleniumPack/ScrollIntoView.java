package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./exe files/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.seleniumhq.org");
	    
	      String jsCode1 = "arguments[0].scrollIntoView(true)";
	                String css = "img[src*='applitools.png']";
	                
	                JavascriptExecutor je = (JavascriptExecutor) driver;
	                je.executeScript(jsCode1, driver.findElement(By.cssSelector(css)));
	                
	                Thread.sleep(2000);
	                String jsCode2 = "arguments[0].click()";
	                je.executeScript(jsCode2, driver.findElement(By.cssSelector(css)));
	    

	}

}
