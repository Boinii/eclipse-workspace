package Com.OrangeHRMApplication;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class applicationlogin {
	
	public static void main(String[] args) throws IOException {
		WebDriver Driver;
		String ApplicationnUrladress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		Driver=new ChromeDriver();
		Driver.get(ApplicationnUrladress);
		//name="txtUsername" 
		//id="txtUsername"
		String Usernametestdata="Admin";
		By usernameproprty=By.id("txtUsername");
	WebElement username=Driver.findElement(usernameproprty);
	username.sendKeys(Usernametestdata);
	System.out.println("The username automaticaly enterd sucessfully ");
	//id="txtPassword" 
	String passwordtestdata="Rena@amma123";
	By passwordproperty=By.id("txtPassword") ;
	WebElement password=Driver.findElement(passwordproperty);
	password.sendKeys(passwordtestdata);
	System.out.println("The password was entered automaticaly in the box");
	//class="button"
	By loginbuttonproperty=By.className("button");
	WebElement loginbutton=Driver.findElement(loginbuttonproperty);
	loginbutton.click();
	File homepagescreenshot=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(homepagescreenshot, new File("C:\\Users\\boini\\eclipse-workspace\\OrangeHRMApplication\\ScreenShots"+".png"));
	Driver.close();
	System.out.println("The browser closed successfully ");
	}
}
