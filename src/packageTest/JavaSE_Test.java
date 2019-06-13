package packageTest;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import SeleniumPack.BrowserFactory;

public class JavaSE_Test {
	
	  @Test public void login() {
	  
	  WebDriver driver = BrowserFactory.launch("chrome"); JavascriptExecutor js =
	  (JavascriptExecutor)driver; driver.get("http://demo.guru99.com/V4/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS); long
	  start_time =System.currentTimeMillis(); js.
	  executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 5000);"
	  ); System.out.println("Passed time: " + (System.currentTimeMillis() -
	  start_time));
	 
	/*
	 * @Test public void Login() {
	 * 
	 * WebDriver driver = BrowserFactory.launch("chrome"); Alert alt =
	 * driver.switchTo().alert(); //Creating the JavascriptExecutor interface object
	 * by Type casting JavascriptExecutor js = (JavascriptExecutor)driver;
	 * 
	 * 
	 * //Launching the Site. driver.get("http://demo.guru99.com/V4/");
	 * 
	 * WebElement button =driver.findElement(By.name("btnLogin"));
	 * 
	 * //Login to Guru99 driver.findElement(By.name("uid")).sendKeys("mngr34926");
	 * driver.findElement(By.name("password")).sendKeys("amUpenu");
	 * 
	 * //Perform Click on LOGIN button using JavascriptExecutor
	 * js.executeScript("arguments[0].click();", button); String getTxt =
	 * alt.getText(); System.out.println(getTxt); alt.accept();
	 * 
	 * }
	 */
}
}