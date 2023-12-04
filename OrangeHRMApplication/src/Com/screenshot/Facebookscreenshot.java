package Com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookscreenshot {
	WebDriver Driver;
	String applicationURladress="http://facebook.com";
	
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		Driver=new ChromeDriver();
		System.out.println("The Browse launched scessfully ");
		Driver.get(applicationURladress);
		System.out.println("The Facebook webpage Launched sucessfully ");
		Driver.manage().window().maximize();
		System.out.println("The wiindows maximized successfully ");
		Thread.sleep(5000);
		System.out.println("The timer setted sucessflly for the webpage ");
	}
	public void capcturingscreenshot() throws IOException {
		File Facebook=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Facebook,new File("C:\\Users\\boini\\eclipse-workspace\\OrangeHRMApplication\\Screenshot"+".jpg"));
	System.out.println("The screenshot capctured scessfully ");
	}
	public void teardown() {
		Driver.quit();
		System.out.println("The brower closed successfully ");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		Facebookscreenshot File=new Facebookscreenshot();
		File.setup();
		File.capcturingscreenshot();
		File.teardown();
		
		
		
	}
}
