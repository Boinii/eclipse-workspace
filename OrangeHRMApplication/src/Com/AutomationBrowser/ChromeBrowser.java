package Com.AutomationBrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChromeBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
	ChromeDriver Driver=new ChromeDriver();
	System.out.println("browser launchd sucessfully ");
		Driver.get("http://youtube.com");
		System.out.println("The webpage launnched sucessfully ");
		Driver.close();
		System.out.println("The browser closed sucessfully ");
		
		

	}

}
