package Com.googlesigin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sigintext {

	public static void main(String[] args) {
WebDriver Driver;
String ApplicationUrlAdress="http://google.com";
System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
Driver=new ChromeDriver();
Driver.get(ApplicationUrlAdress);
//<a class="gb_za gb_jd gb_Ld gb_ie" aria-label="Sign in" 
//href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/&amp;ec=GAZAmgQ" 
//target="_top"><span class="gb_Hd">Sign in</span></a>
By signinproperty=By.linkText("Sign in");
WebElement signin=Driver.findElement(signinproperty);
//signin.click();
String expectedtext="signin";
System.out.println("The expected text is :- "+expectedtext);
String actualtext=signin.getText();
System.out.println("The actual text of the sign is :- "+actualtext);
if(expectedtext.equals(actualtext)) {
	System.out.println("Google homepage sigintext is matches -pass ");
}
else {
	System.out.println("Google homepage sigintext is not matches -fail ");
}
Driver.quit();

	}

}
