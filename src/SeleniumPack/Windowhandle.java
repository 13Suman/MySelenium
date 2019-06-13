package SeleniumPack;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Windowhandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = BrowserFactory.launch("chrome");
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/torry/login.do");
		driver.findElement(By.name("username")).sendKeys("suman@renovite.com");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[2]")).click();
		//driver.findElement(By.className("popup_menu_button popup_menu_button_support popup_menu_button_pressed")).click();
		//driver.findElement(By.partialLinkText("popup_menu_body")).click();
		driver.findElement(By.xpath("(//div[@class='item_title'])[4]")).click();
		Set<String> sessions = driver.getWindowHandles();
		System.out.println(sessions.getClass().getSimpleName());
		System.out.println(sessions);
		System.out.println(sessions.size());
		       Iterator<String> itr = sessions.iterator();
		                    String parentID = itr.next();
		                    System.out.println(parentID);
		                            String childID = itr.next();
		                            System.out.println(childID);
		                            driver.switchTo().window(childID);
		                            driver.manage().window().maximize();
		                            //driver.findElement(By.xpath("//a[contains(text(),'Download Add-on')]")).click();
		                            Thread.sleep(5000);
		                            driver.close();
		

	}

}
