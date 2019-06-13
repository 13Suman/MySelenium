package SeleniumPack;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CalendarPopupAssignment {

	public static void main(String[] args) {

		WebDriver driver = BrowserFactory.launch("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
	 
		WebElement text = driver.findElement(By.xpath("//label[@for='fromCity']"));
		Actions act = new Actions(driver);
     	act.click(text).perform();
		act.sendKeys(text, "Del").perform();
		act.pause(2000).perform();
		act.sendKeys(text, Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		WebElement text1 = driver.findElement(By.xpath("//label[@for='toCity']"));
		act.click(text1).perform();
		act.sendKeys(text1, "Bangal").perform();
		act.pause(2000).perform();
		act.sendKeys(text, Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();

		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		int currentMonth = LocalDate.now().getMonthValue();

		int reqDate = LocalDate.now().plusDays(1).getDayOfMonth();
		LocalDate ld = LocalDate.now().plusMonths(2);
		int reqMonth = ld.getMonthValue();
		String getMonthName = ld.getMonth().name();
		getMonthName = getMonthName.substring(0, 1) + getMonthName.substring(1).toLowerCase();
		for (int i = currentMonth; i < reqMonth; i++) {
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();

		}

		String xp = "//div[starts-with(text(),'" + getMonthName
				+ "')]//ancestor::div//following-sibling::div//p[text()='" + reqDate + "']";
		driver.findElement(By.xpath(xp)).click();

		driver.findElement(By.xpath("//span[text()='RETURN']")).click();
		int reqDate1 = LocalDate.now().plusDays(1).getDayOfMonth();
		LocalDate ld1 = LocalDate.now().plusMonths(6);
		int reqMonth1 = ld1.getMonthValue();
		String getMonthName1 = ld1.getMonth().name();
		getMonthName1 = getMonthName1.substring(0, 1) + getMonthName1.substring(1).toLowerCase();
		//System.out.println(getMonthName1);
		
		  
		  for (int j =reqMonth ; j<reqMonth1 ; j++) {
		  driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		  
		  }
		  
		
		 String xp1 = "//div[starts-with(text(),'"+getMonthName1+"')]//ancestor::div//following-sibling::div//p[text()='"+reqDate1+"']";
		 driver.findElement(By.xpath(xp1)).click();
		
		 driver.findElement(By.xpath("//a[text()='Search']")).click();
       
	}

}
