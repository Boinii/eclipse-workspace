package Com.AutomationBrowser;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeAutomation {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./Browsers/msedgedriver.exe");
		EdgeDriver Driver=new EdgeDriver();
		System.out.println("Browser launched sucessfully ");
		Driver.get("http://livetech.com");
		System.out.println("Thhe webpage launched sucessfully ");
		Driver.close();
		System.out.println("The browser closed sucessfully ");
		
		
	}

}
