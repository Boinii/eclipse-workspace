package Com.Droupdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	WebDriver Driver;
    public void setup() {
    	//WebDriver Driver;
    	String ApplicationUrlAdress="https://www.osmania.ac.in/";
    	System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
    	Driver=new ChromeDriver();
    	Driver.get(ApplicationUrlAdress);
    	Driver.manage().window().maximize();
    }
    public void teardown() {
    	Driver.close();
    }
    

}
