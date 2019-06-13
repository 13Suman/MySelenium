package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageSource {

	public static void main(String[] args) {
		
		                   WebDriver driver = BrowserFactory.launch("chrome");
		                   driver.get("file:///C:/Users/suman/Desktop/NSSW17.html");
		                                   String title = driver.getTitle();
		                                   System.out.println(title);
		                                   
		                                     String htmlsource = driver.getPageSource();
		                                     System.out.println(htmlsource);
		                                     
		                                     driver.findElement(By.linkText("Selenium")).click();
		                                                 String url = driver.getCurrentUrl();
		                                                 System.out.println(url);

	}

}
