package SeleniumPack;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxNavigation {

	public static void main(String[] args) throws InterruptedException {
		//FirefoxOptions options =new FirefoxOptions();
		System.setProperty("webdriver.gecko.driver", "./exe files/geckodriver.exe");
		System.out.println(Thread.currentThread().getName());
		FirefoxDriver f=new FirefoxDriver();
		f.navigate().to("https://www.seleniumhq.org/");
		
		Thread.sleep(2000);
		
		f.navigate().back();
		
		Thread.sleep(2000);
		
		f.navigate().forward();
		
		Thread.sleep(2000);
		
		f.navigate().refresh();
		

	}

}