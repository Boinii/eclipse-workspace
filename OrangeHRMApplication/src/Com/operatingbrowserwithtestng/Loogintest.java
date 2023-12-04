package Com.operatingbrowserwithtestng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Loogintest extends OrangeHRM {
	@Test(priority=1,description="Login Functionality testing")
	public void logintest() throws IOException {
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
	//Driver.close();
	System.out.println("The browser closed successfully ");

		
	}

}
