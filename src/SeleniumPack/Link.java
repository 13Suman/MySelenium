package SeleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Link {

	public static void main(String[] args) {
		           WebDriver driver = BrowserFactory.launch("chrome");
		           driver.get("https://www.seleniumhq.org/");
		           List<WebElement> link = driver.findElements(By.tagName("a"));
		           System.out.println(link.getClass().getSimpleName());
		          System.out.println("Total size" +link.size());
		          
		          int displayCount =0;
	        	     int hiddenCount=0;
		          for (int i = 0; i < link.size(); i++) {
		        	     
					     WebElement wb = link.get(i);
					     if (wb.isDisplayed())
					     {         
					    	 displayCount++;
					    	 System.out.println(wb.getText());
					     }
					     else
					     {
					    	 hiddenCount++;
					     }
					     
				}
		          System.out.println("Total no. of display " +displayCount);
				     System.out.println("Total no. of hidden display " +hiddenCount);                      

	}

}
