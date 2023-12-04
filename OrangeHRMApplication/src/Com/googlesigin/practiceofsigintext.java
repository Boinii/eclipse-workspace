package Com.googlesigin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceofsigintext {
	public static void main(String[] args) {
		WebDriver Driver;
		String applicationURLadress="http://google.com";
		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get(applicationURLadress);
		String expectedtitle="google";
		System.out.println("The expected title of the page is :- "+expectedtitle);
		String actualtitle=Driver.getTitle();
		System.out.println("The actual title of the page is :- "+actualtitle);
if(expectedtitle.equals(actualtitle)) {
	System.out.println("The Expected title is equals to the actul title of the page");
}
else {
	System.out.println("The actual title page is not equals to the eepected homepage ");
}
//<a class="gb_za gb_jd gb_Ld gb_ie" aria-label="Sign in" 
//href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/&amp;ec=GAZAmgQ" 
//target="_top"><span class="gb_Hd">Sign in</span></a>
By signinproperty=By.partialLinkText("Sign in");
WebElement signin=Driver.findElement(signinproperty);
String expectedpropertytext="signin";
System.out.println("The expected text is :- "+expectedpropertytext);
String actualpropertytext=signin.getText();
System.out.println("The actual text of the property is :- "+actualpropertytext);
if(actualpropertytext.equals(expectedpropertytext)) {
System.out.println("The Expected text matched with thhe actual text - PASS");	
}
else {
	System.out.println("The expected text is not matched with the actual text - FAIL");
}
Driver.close();
}

}
