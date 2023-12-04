package Com.dateandtime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	WebDriver Driver;
	String ApplicationUrlAdress="https://www.timeanddate.com/worldclock/";
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		Driver=new ChromeDriver();
		Driver.get(ApplicationUrlAdress);
		Driver.manage().window().maximize();
	}
	public void teardown() {
		Driver.close();
		System.out.println("Driver closed successfully ");
	}

}
