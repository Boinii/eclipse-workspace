package Com.gettingtextwithlinksofpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 {
	public static void main(String[] args) {
		WebDriver Driver;
		String ApplicationnURLadress="https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get(ApplicationnURLadress);
		//<a class="tabcopy" href="/oprs-web/ticket/waitlist.do"
				//target="_top" title="Enquiry">Enquiry</a>
		By Enquiryproperty=By.tagName("a");
		List<WebElement>commonlinks=Driver.findElements(Enquiryproperty);
		int Enquiryproppertycounts=commonlinks.size();
		System.out.println("The homepage counts is :- "+Enquiryproppertycounts);
for(int index=0;index<commonlinks.size();index++) {
	String Enquirypropertylistnames=commonlinks.get(index).getText();
	System.out.println(index+"-"+Enquirypropertylistnames);
	}
Driver.close();
	
	
	}

}
