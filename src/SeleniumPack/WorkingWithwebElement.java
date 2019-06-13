package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WorkingWithwebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = BrowserFactory.launch("chrome");
		driver.get("file:///C:/Users/suman/Desktop/NSSW17.html");
		/*WebElement unTxtBx = driver.findElement(By.id("user"));
		unTxtBx.sendKeys("abc");
		//unTxtBx.clear();
		unTxtBx.sendKeys(Keys.CONTROL+"a" );
		Thread.sleep(2000);
		unTxtBx.sendKeys(Keys.DELETE);
		unTxtBx.sendKeys("xyz");
		 String headerText = driver.findElement(By.tagName("h1")).getText();
		 System.out.println(headerText);	
		         WebElement pwdTxt = driver.findElement(By.name("pwd"));
		         String value1=pwdTxt.getAttribute("placeholder");
		         System.out.println(value1);
		                      pwdTxt.sendKeys("123456789abcd");
		                      String value2 = pwdTxt.getAttribute("value");
		                      System.out.println(value2);
		                      
		                     String cssvalue = driver.findElement(By.tagName("a")).getCssValue("font-size");
		                     System.out.println(cssvalue);
		                     
		                      Dimension dim = driver.findElement(By.tagName("img")).getSize();
		                          int height = dim.getHeight();
		                          int width =dim.getWidth();
		                          System.out.println("Height of Image" +height);
		                          System.out.println("Height of Image" +width);
		                          
		                        int siz = driver.findElement(By.tagName("body")).getSize().getHeight();
		                         System.out.println(siz);
		                         
		                         Point pt = driver.findElement(By.tagName("img")).getLocation();
		                         int x = pt.getX();
		                         int y= pt.getY();
		                         System.out.println("Image Location::: " + x +"\t" +y );  */
		               
		                         WebElement chkBox = driver.findElement(By.className("MyCheckbox"));
		                                      boolean flag = chkBox.isSelected();
		                                      if (flag)
		                                      {
		                                    	  System.out.println("Checkbox is already enabled");
		                                      }
		                                      else
		                                      {
		                                    	  System.out.println("select checkbox");
		                                    	  chkBox.click();
		                                      }
		                                      
		                               
		                          

	}

}
