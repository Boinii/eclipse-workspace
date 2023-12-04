package Com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.CaptureScreenshot;



public class Amazon {
	
	WebDriver Driver;
	String ApplicationUrladress="http://amazon.com";
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		Driver=new ChromeDriver();
		Driver.get(ApplicationUrladress);
		Driver.manage().window().maximize();
	}
	public void capcturing() throws IOException {
		File bingScreenShot=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(bingScreenShot, new File("C:\\Users\\boini\\eclipse-workspace\\OrangeHRMApplication\\Screenshot.png"));


	}
	public void teardown() {
		Driver.quit();
		System.out.println("Driver closed successfully");
	}
	public static void main(String[] args) throws IOException {
		Amazon screenshot=new Amazon();
		screenshot.setup();
		screenshot.capcturing();
		screenshot.teardown();
	}
	

}
