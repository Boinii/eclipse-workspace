package Com.validatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class Validatinngtsrcttle {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://www.tsrtconline.in/oprs-web/");
		String expectedtitle="tsrtc";
		System.out.println("The expected title is :- "+expectedtitle);
		String actaltitle=Driver.getTitle();
		System.out.println("The actual title of the page is :- "+actaltitle);
		if(expectedtitle.equals(actaltitle)) {
			System.out.println("The expected is equals to the actual title ");
		}
		else {
			System.out.println("The expected is notequals to the actual title ");
		}
		Driver.close();
		
	}

}
