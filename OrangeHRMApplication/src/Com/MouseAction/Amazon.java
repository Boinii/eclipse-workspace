package Com.MouseAction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;

public class Amazon {
	 
	public static void main(String[] args) {
		WebDriver Driver ;
		String ApplicationUrladress="http://amzon.com";
		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
       Driver=new ChromeDriver();
       Driver.manage().window().maximize();
       Driver.get(ApplicationUrladress);
       //<span id="nav-link-accountList-nav-line-1" 
       //class="nav-line-1 nav-progressive-content">Hello, 
       //sign in</span>
      By hellosigninproperty=By.id("nav-link-accountList-nav-line-1");
      WebElement hellosigin=Driver.findElement(hellosigninproperty);
      Actions hellosinginmousehover=new Actions(Driver);
      hellosinginmousehover.moveToElement(hellosigin).build().perform();
      //<span class="nav-text">Orders</span>	
     By Ordersproperty=By.className("nav-text");
    WebElement Orders=Driver.findElement(Ordersproperty);
    Orders.click();
    String actualtitle=Driver.getTitle();
    System.out.println("the actual title of the page is :- "+actualtitle);
    Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    Driver.close();    
      
    
     
       
       
		
		
		
	}

}
