package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameHandling {

	public static void main(String[] args) {
		
	WebDriver driver = BrowserFactory.launch("chrome");
	driver.manage().window().maximize();
	driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
	 
	driver.switchTo().frame("packageListFrame");
	       String xp = "//ul[@title='Packages']//a[text()='com.thoughtworks.selenium']";
	       driver.findElement(By.xpath(xp)).click();
	       
	       driver.switchTo().defaultContent();
	 driver.switchTo().frame("packageFrame");
             String ul = "//ul[@title='Classes']//a[text()='DefaultSelenium']";	
             driver.findElement(By.xpath(ul)).click();
             
             driver.switchTo().defaultContent();
             driver.switchTo().frame("classFrame");
             driver.findElement(By.xpath("//a[text()='WebDriverBackedSelenium']")).click();               

	}

}
