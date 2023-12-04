package Com.validatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class Validatig {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("http://facebook.com");
		String expectedttitle="facebook";
		System.out.println("The expected title is :- "+expectedttitle);
		String actualtitle=Driver.getTitle();
		System.out.println("The actual tite of the page is :- "+actualtitle);
		if(expectedttitle.equals(actualtitle)) {
			System.out.println("The expected title is equals to the actual title ");
		}
		else {
			System.out.println("The expected title is not equals to the actual title ");
		}
		Driver.close();
		

	}

}
