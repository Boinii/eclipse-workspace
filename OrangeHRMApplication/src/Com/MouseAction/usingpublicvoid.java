package Com.MouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class usingpublicvoid {
	WebDriver Driver;
	String ApplicationURLadress="http://amazon.com";
	public void setup() {
		//WebDriver Driver;
		//String ApplicationURLadress="http://amazon.com";
		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
	Driver=new ChromeDriver();
	}
public void amazon() {
	Driver.manage().window().maximize();
	Driver.get(ApplicationURLadress);
	//<span id="nav-link-accountList-nav-line-1" 
	//class="nav-line-1 nav-progressive-content">Hello, 
	//sign in</span>
	By hellosigninproperty=By.id("nav-link-accountList-nav-line-1");
	WebElement hellosignin=Driver.findElement(hellosigninproperty);
	Actions hellosigninmousehover=new Actions(Driver);
	hellosigninmousehover.moveToElement(hellosignin).build().perform();
	//<span class="nav-text">Watchlist</span>
	By watchlistpoperty=By.className("nav-text");
	WebElement watchlist=Driver.findElement(watchlistpoperty);
	watchlist.click();
	String actualpagetitle=Driver.getTitle();
	System.out.println("The title of the current page is :- "+actualpagetitle);
}
public void teardown() {
	Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	Driver.close();
	System.out.println("The browser closed successfully ");
}

public static void main(String[] args) {
	usingpublicvoid amazon=new usingpublicvoid ();
	amazon.setup();
	amazon.amazon();
	amazon.teardown();
}
}
