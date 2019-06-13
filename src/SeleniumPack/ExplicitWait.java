package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver = BrowserFactory.launch("chrome");
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		driver.findElement(By.xpath("(//a[text()='Login'])[3]")).click();
		 WebElement userBtn = driver.findElement(By.xpath("//button[text()='Business user ']"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		        WebElement businessUser = wait.until(ExpectedConditions.visibilityOf(userBtn));
		        businessUser.click();
		        driver.findElement(By.id("loginemail")).sendKeys("abc@gmail.com");
		        driver.findElement(By.id("password")).sendKeys("12345");
		        driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		      WebElement text = driver.findElement(By.xpath("(//input[@id='loginemail']/following-sibling::label[2])"));
		      
		    String xp  ="Please login using the OTP option";
     Boolean flag = wait.until(ExpectedConditions.textToBePresentInElement(text, xp));
     System.out.println(flag);
     
     if(flag)
     {
    	 System.out.println(text.getText());
     }
     else
     {
    	 System.out.println("Text not present");
     }
	}

}
