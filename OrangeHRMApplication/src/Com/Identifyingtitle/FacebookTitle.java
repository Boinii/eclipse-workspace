package Com.Identifyingtitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTitle {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		Driver.navigate().to("http://facebook.com");
		String titeofthepage=Driver.getTitle();
		System.out.println("The title of the page is :- "+titeofthepage);
		Driver.close();
		}
}
