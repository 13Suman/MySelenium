package SeleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Options {

	public static void main(String[] args) {
		 
		                 WebDriver driver = BrowserFactory.launch("chrome");
		                 driver.get("file:///C:/Users/suman/Desktop/NSSW17.html");
		                   WebElement dropdwn = driver.findElement(By.name("Courses"));
		                     Select sel = new Select(dropdwn);
		                         List<WebElement> allOptions = sel.getOptions();
                            System.out.println(allOptions.getClass().getSimpleName());
                            System.out.println("Total size" +allOptions.size());
                            
                            for (int i = 0; i < allOptions.size(); i++) {
                                       sel.selectByIndex(i);
								
							}
                            for (int j =allOptions.size()-1; j>=0; j--) {
                            	//sel.deselectByIndex(j);
                            	sel.deselectAll();
								
							}
		                         
	}

}
