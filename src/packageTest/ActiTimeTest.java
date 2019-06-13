package packageTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActiTimeTest {
	
	WebDriver driver;

  @BeforeMethod
  public void preCondition() {
	  System.out.println("Before method");
	  System.setProperty("webdriver.chrome.driver", "./exe files/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("http://suman/login.do");
	  
  }
  @AfterMethod
  public void postCondition() {
	  System.out.println("After Method");
	  driver.close();
  }
  @Test(priority=1)
  public void validLogin() {
	  driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
  }
   @Test(priority=2)
   public void invalidLogin(){
	   driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("12345");
		driver.findElement(By.id("loginButton")).click();
   }
	
	  @Test(priority=3) public void createCustomer() throws InterruptedException {
			Actions act = new Actions(driver);
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	 WebElement al = driver.findElement(By.xpath("//div[text()='Tasks']"));
	 act.doubleClick(al).perform();
	 driver.findElement(By.xpath("//a[contains(text(),'Projects & Customers')]")).click();
	 driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
	 driver.findElement(By.name("name")).sendKeys("Suman");
	 driver.findElement(By.name("createCustomerSubmit")).click();
	 Thread.sleep(4000);
	 
	 //act.pause(10000);
	  }
	 
}
