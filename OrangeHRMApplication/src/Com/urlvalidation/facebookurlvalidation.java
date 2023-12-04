package Com.urlvalidation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookurlvalidation {
	
	public static void main(String[] args) {
		WebDriver Driver;
		String ApplicationUrlAdress="http://facebook.com";
		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		Driver=new ChromeDriver();
		Driver.get(ApplicationUrlAdress);
	String actualtitle=Driver.getTitle();
	System.out.println("The actual title of the page is :- "+actualtitle);
	System.out.println("The expected url is :- "+ApplicationUrlAdress);
	String actualurl=Driver.getCurrentUrl();
	System.out.println("The current url of the page is :- "+actualurl);
    Driver.quit();
    
    
	}
	

}
