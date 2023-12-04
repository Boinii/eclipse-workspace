package Com.HeaderBlockTesting;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tsrtcheaderblockcapcturingscreenshot {
	
	public static void main(String[] args) throws IOException {
		WebDriver Driver;
		String ApplicationUrladress="https://www.tsrtconline.in/oprs-web/login/show.do";
		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		Driver=new ChromeDriver();
		Driver.get(ApplicationUrladress);
		Driver.manage().window().maximize();
		/*<div class="menu">
			<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
					Home</a>
				<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
				<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
				<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
				<a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>
				<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
				<a class="tabcopy blinking" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a>
				<a class="tabcopy" href="/oprs-web/services/driverInfo.do" target="_top" title="Driver Info">Driver Info</a>
				<!-- <a class="tabcopy" href="https://forms.gle/BVVhmKJ8gnd7rWvr8" target="_blank" title="Customer Survey Form" style="float: right !important;">Customer Survey Form</a> -->
                </div>
                          */
		By tsrtc_headerblockproperty=By.className("menu");
		WebElement tsrtc_headerblock=Driver.findElement(tsrtc_headerblockproperty);
		By headerbloclinks=By.tagName("a");
		List<WebElement>links=Driver.findElements(headerbloclinks);
		int linkscount=links.size();
		System.out.println("The links nmber of couts is :- "+linkscount);
		for(int index=0;index<links.size();index++) {
			String Tsrtc_HeaderBlocktext=links.get(index).getText();
			System.out.println(index+"-"+Tsrtc_HeaderBlocktext);
		}
		String expectedTsrtc_homepagecurrenturladress=links.get(linkscount).getAttribute(ApplicationUrladress);
		System.out.println("The expected current urladress is :- "+expectedTsrtc_homepagecurrenturladress);
		links.get(linkscount).click();
		String actuallinkpagetitle=Driver.getTitle();
		String actual_urladress=Driver.getCurrentUrl();
		System.out.println("The actual linnkpage title is :- "+actuallinkpagetitle);
		System.out.println("The actua urladess of the page is :- "+actual_urladress);
		if(expectedTsrtc_homepagecurrenturladress.equals(actual_urladress)) {
			System.out.println("The url adress is matched -Pass");
		}
		else {
			System.out.println("The url adress is not matched -Fail");
		}
		System.out.println();
		File currentwebpagescreenshot=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(currentwebpagescreenshot, new File("C:\\Users\\boini\\eclipse-workspace\\OrangeHRMApplication\\ScreenShots"+actuallinkpagetitle+".png"));
		Driver.navigate().back();
		tsrtc_headerblock=Driver.findElement(headerbloclinks);
	List<WebElement> Names = tsrtc_headerblock.findElements(headerbloclinks);		
		
		Driver.quit();
		
		




	}
	

}
