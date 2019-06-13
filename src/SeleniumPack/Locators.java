package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./exe files/chromedriver.exe");
      
      WebDriver driver =new ChromeDriver();
      System.out.println(driver.getClass().getSimpleName());
      driver.get("file:///C:/Users/suman/Desktop/NSSW17.html");
                //By by = By.id("user");
                //WebElement unTxtBx = driver.findElement(by);
                //System.out.println(unTxtBx.getClass().getSimpleName());
                //unTxtBx.sendKeys("abc");
                        //or
                //driver.findElement(By.id("user")).sendKeys("xyz");
                  driver.findElement(By.cssSelector("input[placeholder  ='enter username']")).sendKeys("xyz");
                
                driver.findElement(By.name("pwd")).sendKeys("1234");
                
                //driver.findElement(By.className("MyCheckbox")).click();
                
                //driver.findElement(By.tagName("a")).click();
                //driver.findElement(By.cssSelector("input[value= 'LOGIN']")).click();
                driver.findElement(By.cssSelector("input[name ='rd'][class = 'female']")).click();

	}

}
