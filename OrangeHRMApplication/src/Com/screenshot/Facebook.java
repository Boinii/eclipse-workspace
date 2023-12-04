package Com.screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ScreenshotException;

import com.google.common.io.Files;

public class Facebook {
	WebDriver Driver;
	String applicationUrladress="http;//facebook.com";
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get(applicationUrladress);		
	}
	public void capcturingscreenshot() throws IOException {
		File bingScreenShot=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
	Files.copy(bingScreenShot, new File("./Screenshot/amazon/.png"));
	}
	public void teardown() {
		Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Driver.close();
		System.out.println("browser closed succesfully ");
	}

	public static void main(String[] args) throws IOException {
		Facebook screenshot=new Facebook();
		screenshot.setup();
		//screenshot.capcturingscreenshot();
		//screenshot.teardown();
		
	}
	}
