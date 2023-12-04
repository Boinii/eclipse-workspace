package Com.TSRTCAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findinglinkscommonproperty {
	
	public static void main(String[] args) {
		WebDriver Driver;
		String ApplicationUrladress="https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		Driver=new ChromeDriver();
		Driver.get(ApplicationUrladress);
		//<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
		//Home</a>
		By commonlinkproperty=By.tagName("a");
		List<WebElement> commonlink=Driver.findElements(commonlinkproperty);
		int countofpage=commonlink.size();
		System.out.println("The number of the applications in the pahe is :- "+countofpage);
		Driver.close();
}
	

}
