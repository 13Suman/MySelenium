package packageTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActiTimeScenarioTest {
	
     WebDriver driver;	
	@BeforeClass
	public void setUp() {
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver", "./exe files/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://suman/login.do");
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("After class");
		driver.quit();
	}
	
	@AfterMethod
	public void postCondition() {
		System.out.println("After Method");
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}
	
  @Test(priority=1)
  public void validLogin() {
	  System.out.println("Valid login");
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
  }
  @Test(priority=2)
   public void createNewCustomer(){
	  System.out.println("Create Customer");
	  Actions act = new Actions(driver);
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	 WebElement al = driver.findElement(By.xpath("//div[text()='Tasks']"));
	 act.doubleClick(al).perform();
	 driver.findElement(By.xpath("//a[contains(text(),'Projects & Customers')]")).click();
	 driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
	 driver.findElement(By.name("name")).sendKeys("Geeta");
	 driver.findElement(By.name("createCustomerSubmit")).click();  
  }
  @Test(dependsOnMethods= {"createNewCustomer"})
  public void createNewProject() {
	  System.out.println("Create Project");
	  Actions act = new Actions(driver);
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	 WebElement al = driver.findElement(By.xpath("//div[text()='Tasks']"));
	 act.doubleClick(al).perform();
	 driver.findElement(By.xpath("//a[contains(text(),'Projects & Customers')]")).click(); 
	 driver.findElement(By.xpath("//input[@value='Create New Project']")).click();
	WebElement ob = driver.findElement(By.name("customerId"));
	act.doubleClick(ob).click();
	act.sendKeys(ob, Keys.ARROW_DOWN).perform();
	driver.findElement(By.name("name")).sendKeys("Selenium Project");
	driver.findElement(By.name("createProjectSubmit")).click();
  }
}
