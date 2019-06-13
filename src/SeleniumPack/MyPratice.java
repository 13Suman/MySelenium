package SeleniumPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyPratice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = BrowserFactory.launch("chrome");
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		 /* Actions act = new Actions(driver); WebElement ts
		  =driver.findElement(By.xpath(" //span[@class='landingSprite myIconWhite']"));
		  act.doubleClick(ts).perform();
		 */
		  driver.findElement(By.xpath("//p[contains(text(),'Login or Create Account')]")).click();
		
		/*  WebDriverWait wait = new WebDriverWait(driver, 20); 
		  WebElement user =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='makeFlex googleLoginBtn flexOne'])/span[1]")));
		  act.doubleClick(user).perform();
		*/
		  Thread.sleep(3000);
		 driver.findElement(By.xpath("(//span[contains(text(),'Login')])[4]")).click();

	}

}
