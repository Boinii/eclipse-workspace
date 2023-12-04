package Com.operatingbrowserwithtestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class OrangeHRM {
	WebDriver Driver;
	String ApplicationURLadress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	@BeforeTest
	public void setup() {
	//	WebDriver Driver;
//String ApplicationURLadress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
Driver=new ChromeDriver();
Driver.get(ApplicationURLadress);
//Driver.manage().window().maximize();
	}
	@AfterTest
	public void teardown() {
		//Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Driver.quit();
		System.out.println("The browser closed successfully ");
	}
	

}
