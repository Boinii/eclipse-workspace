package Com.gettingtextwithlinksofpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	public static void main(String[] args) {
		WebDriver Driver;
		String ApplicationnURLadress="https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		Driver=new ChromeDriver();
		Driver.get(ApplicationnURLadress);
		//<a class="tabcopy" href="/oprs-web/ticket/waitlist.do"
				//target="_top" title="Enquiry">Enquiry</a>
		By Enquiryproperty=By.tagName("a");
		List<WebElement>Enquirylist=Driver.findElements(Enquiryproperty);
		int commonlinkscount=Enquirylist.size();
		System.out.println("The counts of common list is :- "+commonlinkscount);
		for(int index=0;index<Enquirylist.size();index++) {
			String linksnames=Enquirylist.get(index).getText();
			System.out.println(index+"-"+linksnames);
		}
	}
	

}
