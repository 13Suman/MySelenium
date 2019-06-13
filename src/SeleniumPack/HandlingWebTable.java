package SeleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingWebTable {

	public static void main(String[] args) {
		
		WebDriver driver = BrowserFactory.launch("chrome");
		driver.get("file:///C:/Users/suman/Desktop/NSSW17.html");
		String rowsXp = "//table[@name='Num']//tr";
		         List<WebElement> rows = driver.findElements(By.xpath(rowsXp));
		         System.out.println("Total rows" + rows.size());
 
		          int sum=0;
		         for (int i = 1; i <= rows.size(); i++) {
		        	String colsXp = "//table[@name='Num']//tr["+i+"]//td";
		        	              List<WebElement> cols = driver.findElements(By.xpath(colsXp));
		        	              System.out.println("Total columns" +cols.size());
		        	              
		        	              for (int j = 1; j <= cols.size(); j++) {
		        	            	  String xp = "//table[@name='Num']//tr["+i+"]//td["+j+"]";
		        	            	         String data = driver.findElement(By.xpath(xp)).getText();
									         System.out.println(data);
									         sum=sum +Integer.parseInt(data);
								}
					
				}System.out.println("Total sum" +sum);
	}

}
