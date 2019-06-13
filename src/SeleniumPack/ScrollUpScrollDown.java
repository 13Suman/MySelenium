package SeleniumPack;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpScrollDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./exe files/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.seleniumhq.org");
	   
	              String jsCode1 = "window.scrollBy(0, document.body.scrollHeight)";
	              
	              JavascriptExecutor je = (JavascriptExecutor)driver;
	              je.executeScript(jsCode1);
	              
	              Thread.sleep(2000);
	              
	              String jsCode2 = "window.scrollBy(0, -1000)";
	              je.executeScript(jsCode2);

	}

}
