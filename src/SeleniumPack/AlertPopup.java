package SeleniumPack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPopup {

	public static void main(String[] args) {
		 
		WebDriver driver = BrowserFactory.launch("chrome");
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.findElement(By.xpath("//div[@id='banner']//a[starts-with(text(),'CONTINUE')]")).click();
		driver.findElement(By.id("Button2")).click();
        Alert alt = driver.switchTo().alert();
        driver.getClass().getSimpleName();
        
       String getTxt = alt.getText();
       System.out.println(getTxt);
       alt.accept();
       
       
	}

}
