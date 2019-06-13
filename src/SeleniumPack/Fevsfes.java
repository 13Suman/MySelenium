package SeleniumPack;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Fevsfes {

	public static void main(String[] args) {
		
		WebDriver driver = BrowserFactory.launch("chrome");
        driver.get("https://www.seleniumhq.org/");
            List<WebElement> wbs = driver.findElements(By.tagName("span"));
                              boolean flag = wbs.isEmpty();
                              
                              if (flag)
                              {
                            	  System.out.println("Empty list" +wbs.size());
                              }
                              else
                              {
                            	  System.out.println("List is not empty" +wbs.size());
                              }
                              try
                              {
                            	  driver.findElement(By.tagName("span"));
                            	  
                              }
                              catch(NoSuchElementException e)
                              {
                            	  System.out.println("ELement not exist in html doc");
                              }
	}

}
