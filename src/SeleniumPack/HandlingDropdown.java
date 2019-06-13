package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	      public static boolean verifyDropDown(WebElement dropdown)
	      {
	    	                Select sel = new Select(dropdown); 
	    	                       boolean flag = sel.isMultiple();
	    	                       System.out.println(flag);      
	    	                       if (flag)
	    	                       {
	    	                    	   System.out.println("multi-select");
	    	                       }
	    	                       
	    	                       else
	    	                       {
	    	                    	   System.out.println("single-select");
	    	                       }
	    	              return flag;
	      }
	public static void main(String[] args) {
		
		                      WebDriver driver = BrowserFactory.launch("chrome");
		                      driver.get("file:///C:/Users/suman/Desktop/NSSW17.html");
		                           WebElement drpDwn1 = driver.findElement(By.name("Country"));
		                           verifyDropDown(drpDwn1);
		                           WebElement drpDwn2 = driver.findElement(By.name("Courses"));
		                           verifyDropDown(drpDwn2);
		                           
		                          //WebElement drpDwn = driver.findElement(By.name("Country"));
                                          // Select sel = new Select (drpDwn);
                                           //sel.selectByIndex(5);
                                           //sel.selectByValue("6");
                                           //sel.selectByVisibleText("India");
	}

}
