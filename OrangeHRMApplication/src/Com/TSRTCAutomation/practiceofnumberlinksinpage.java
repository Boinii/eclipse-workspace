package Com.TSRTCAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceofnumberlinksinpage {
	
	public static void main(String[] args) {
		WebDriver Driver;
		String ApplicationUrladress="https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		Driver=new ChromeDriver();
		Driver.get(ApplicationUrladress);
		//<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
		//Home</a>
		By commonlinksproperty=By.tagName("a");
	List<WebElement>commonlinks=Driver.findElements(commonlinksproperty);
	
	int Homepagelinkscount=commonlinks.size();
	System.out.println("The number of linnks in the homepage is :- "+Homepagelinkscount);
Driver.close();	}

}
