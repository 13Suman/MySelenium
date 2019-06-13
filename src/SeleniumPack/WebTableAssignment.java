package SeleniumPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTableAssignment {

	public static void main(String[] args) {

		WebDriver driver = BrowserFactory.launch("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		String rowsxp = "//table[@id='ctl00_MainContent_orderGrid']//tr";
		List<WebElement> rows = driver.findElements(By.xpath(rowsxp));

		
		String colsxps = "//table[@id='ctl00_MainContent_orderGrid']//tr[" + 1+ "]//th";
		List<WebElement> column = driver.findElements(By.xpath(colsxps));
		
		for (int k = 1; k < column.size(); k++) {

			String xps = "//table[@id='ctl00_MainContent_orderGrid']//tr[" + 1 + "]//th[" + k + "]";
			String data1 = driver.findElement(By.xpath(xps)).getText();
			System.out.println(data1);
					
		}
			
		for (int i = 2; i <= rows.size(); i++) {
			
			String colsxp = "//table[@id='ctl00_MainContent_orderGrid']//tr[" + i + "]//td";
			List<WebElement> cols = driver.findElements(By.xpath(colsxp));
			

			for (int j = 1; j < cols.size(); j++) {
			
				
				
					String xps = "//table[@id='ctl00_MainContent_orderGrid']//tr[" + i + "]//td[" + j + "]";
					String data1 = driver.findElement(By.xpath(xps)).getText();
					System.out.println(data1);
				

			}
		}

	}
}
