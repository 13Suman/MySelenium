package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseOrder {

	public static void main(String[] args) {
		
		WebDriver driver = BrowserFactory.launch("chrome");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		 WebElement homefur = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		 
		  Actions act = new Actions(driver);
		       act.moveToElement(homefur).perform();
		       
		       act.pause(2000).perform();
		       
		                   WebElement painting = driver.findElement(By.linkText("Paintings"));
		                   act.click(painting).perform();
		                   
		       act.pause(3000).perform();
		                       WebElement rightSlider = driver.findElement(By.xpath("//div[@class='_3G9WVX _2N3EuE']"));
		                       
		                       act.clickAndHold(rightSlider).perform();
		                       act.moveByOffset(-90, 0) .perform();
		                       act.release(rightSlider).perform();
		                       
		                       act.pause(3000);
		                        WebElement textBx = driver.findElement(By.name("q"));
		                        act.sendKeys(textBx, "samsung galaxy").perform();
		                        act.pause(2000).perform();
		                        act.sendKeys(textBx, Keys.ARROW_DOWN).perform();
		                        act.pause(1000).perform();
		                        act.sendKeys(Keys.ARROW_DOWN).perform();
		                        act.sendKeys(Keys.ENTER).perform();
		       
		  
		

	}

}
