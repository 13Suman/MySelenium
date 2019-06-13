package SeleniumPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReconAdmin {

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "./exe files/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/");
		
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("username")).sendKeys("sksk6122@gmail.com");
        driver.findElement(By.id("password")).sendKeys("8700473576");
        driver.findElement(By.className("login__form_action_container ")).click();
        driver.findElement(By.className("nav-item__profile-member-photo")).click();
        driver.findElement(By.xpath("(//span[starts-with(text(), 'Me')])[2]")).click();
        driver.findElement(By.xpath("(//span[starts-with(text(), 'Me')])[2]")).click();
        //driver.findElement(By.xpath("//span[contains(text(),'View profile')]")).click();
        driver.findElement(By.xpath("//span[contains(.,'View profile')]")).click();
        
         String xp = "//li-icon[starts-with(@aria-label,'See connections')]/..";
          String data = driver.findElement(By.xpath(xp)).getText();
          System.out.println(data);
       // driver.findElement(By.xpath("//li-icon[starts-with(@aria-label,'See connections')]/.."));
           
       
        
        
        //driver.findElement(By.linkText("Sign out")).click();
      
        
        
	}

}
