package packageTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import SeleniumPack.BrowserFactory;

public class ParallelTest {
 WebDriver driver;
 @BeforeMethod
 @Parameters({"browser", "baseurl"})
 public void preCondition(String browserName, String url)
 {
	 System.out.println("Before Method");
	 driver= BrowserFactory.launch(browserName);
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.get(url);
 }
 @Test
 public void login() {
	 System.out.println("Valid Login");
	 driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager"+Keys.ENTER);
 }
 
}
