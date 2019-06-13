package SeleniumPack;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalendarPopup {

	public static void main(String[] args) {
		
		WebDriver driver = BrowserFactory.launch("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		int currentMonth = LocalDate.now().getMonthValue();
		System.out.println(currentMonth);

		int reqDate = LocalDate.now().plusDays(1).getDayOfMonth();
		 System.out.println(reqDate);
		 LocalDate ld = LocalDate.now().plusMonths(3);
	    int reqMonthValue = ld.getMonthValue();
		  System.out.println(reqMonthValue);
		  String getMonthName = ld.getMonth().name();
		  System.out.println(getMonthName);
		   getMonthName =getMonthName.substring(0, 1)+getMonthName.substring(1).toLowerCase();
		  System.out.println(getMonthName);
		                            
		  for (int i =currentMonth ; i <reqMonthValue ; i++)
		  {
						driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();				
		                            
		  }
		   String xp = "//div[starts-with(text(),'"+getMonthName+"')]//ancestor::div//following-sibling::div//p[text()='"+reqDate+"']";
		   driver.findElement(By.xpath(xp)).click();
		  
	}

}
