package Com.dateandtime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class capcturingdateandtimesofcountryes extends BaseTest{
	
	public void dateandtime() {
//	/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
	By citynameproety=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a");
   
	WebElement cityname=Driver.findElement(citynameproety);
    
	String citynametext=cityname.getText();
	System.out.println("The city name is :- "+citynametext);
	
	}
public static void main(String[] args) {
	capcturingdateandtimesofcountryes dateandtime=new capcturingdateandtimesofcountryes();
	dateandtime.setup();
	dateandtime.dateandtime();
	dateandtime.teardown();
}
}
