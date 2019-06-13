package SeleniumPack;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxPri {

	public static void main(String[] args) {
		FirefoxOptions options =new FirefoxOptions();
		options.addArguments("--private");
		System.setProperty("webdriver.gecko.driver", "./exe files/geckodriver.exe");
		
		FirefoxDriver f=new FirefoxDriver(options);

	}

}
