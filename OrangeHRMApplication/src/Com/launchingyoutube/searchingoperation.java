package Com.launchingyoutube;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchingoperation {
	
	public static void main(String[] args)throws ElementNotInteractableException {
		WebDriver Driver;
		String Applictionurladress="http://youtube.com";
		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		Driver=new ChromeDriver();
		Driver.get(Applictionurladress);
		Driver.manage().window().maximize();
/*<div id="container" class="style-scope ytd-searchbox">
	    <yt-icon id="search-icon" class="style-scope ytd-searchbox"><!--css-build:shady--><!--css-build:shady--><yt-icon-shape class="style-scope yt-icon"><icon-shape class="yt-spec-icon-shape"><div style="width: 100%; height: 100%; fill: currentcolor;"><svg xmlns="http://www.w3.org/2000/svg" enable-background="new 0 0 24 24" height="24" viewBox="0 0 24 24" width="24" focusable="false" style="pointer-events: none; display: block; width: 100%; height: 100%;"><path d="m20.87 20.17-5.59-5.59C16.35 13.35 17 11.75 17 10c0-3.87-3.13-7-7-7s-7 3.13-7 7 3.13 7 7 7c1.75 0 3.35-.65 4.58-1.71l5.59 5.59.7-.71zM10 16c-3.31 0-6-2.69-6-6s2.69-6 6-6 6 2.69 6 6-2.69 6-6 6z"></path></svg></div></icon-shape></yt-icon-shape></yt-icon>
	    <div id="search-input" class="ytd-searchbox-spt" slot="search-input"><input id="search" autocapitalize="none" autocomplete="off" autocorrect="off" name="search_query" tabindex="0" type="text" spellcheck="false" placeholder="Search" aria-label="Search" role="combobox" aria-haspopup="false" aria-autocomplete="list" dir="ltr" class="ytd-searchbox" style="outline: none;"></div>
	    <div id="search-clear-button" class="style-scope ytd-searchbox" hidden=""><ytd-button-renderer class="style-scope ytd-searchbox" button-renderer="" button-next=""><!--css-build:shady--><yt-button-shape><button class="yt-spec-button-shape-next yt-spec-button-shape-next--text yt-spec-button-shape-next--mono yt-spec-button-shape-next--size-m yt-spec-button-shape-next--icon-only-default" aria-label="Clear search query" title="" style=""><div class="yt-spec-button-shape-next__icon" aria-hidden="true"><yt-icon style="width: 24px; height: 24px;"><!--css-build:shady--><!--css-build:shady--><yt-icon-shape class="style-scope yt-icon"><icon-shape class="yt-spec-icon-shape"><div style="width: 100%; height: 100%; fill: currentcolor;"><svg xmlns="http://www.w3.org/2000/svg" enable-background="new 0 0 24 24" height="24" viewBox="0 0 24 24" width="24" focusable="false" style="pointer-events: none; display: block; width: 100%; height: 100%;"><path d="m12.71 12 8.15 8.15-.71.71L12 12.71l-8.15 8.15-.71-.71L11.29 12 3.15 3.85l.71-.71L12 11.29l8.15-8.15.71.71L12.71 12z"></path></svg></div></icon-shape></yt-icon-shape></yt-icon></div><yt-touch-feedback-shape style="border-radius: inherit;"><div class="yt-spec-touch-feedback-shape yt-spec-touch-feedback-shape--touch-response" aria-hidden="true"><div class="yt-spec-touch-feedback-shape__stroke" style=""></div><div class="yt-spec-touch-feedback-shape__fill" style=""></div></div></yt-touch-feedback-shape></button></yt-button-shape><tp-yt-paper-tooltip fit-to-visible-bounds="" offset="8" disable-upgrade=""></tp-yt-paper-tooltip></ytd-button-renderer></div>
	  </div>*/
		String searchtestdata="salaar trailer";
		By searchproperty=By.id("container");
		WebElement search=Driver.findElement(searchproperty);
		search.sendKeys(searchtestdata);
		/*<button id="search-icon-legacy" class="style-scope ytd-searchbox" aria-label="Search">
  <yt-icon class="style-scope ytd-searchbox"><!--css-build:shady--><!--css-build:shady--><yt-icon-shape class="style-scope yt-icon"><icon-shape class="yt-spec-icon-shape"><div style="width: 100%; height: 100%; fill: currentcolor;"><svg xmlns="http://www.w3.org/2000/svg" enable-background="new 0 0 24 24" height="24" viewBox="0 0 24 24" width="24" focusable="false" style="pointer-events: none; display: block; width: 100%; height: 100%;"><path d="m20.87 20.17-5.59-5.59C16.35 13.35 17 11.75 17 10c0-3.87-3.13-7-7-7s-7 3.13-7 7 3.13 7 7 7c1.75 0 3.35-.65 4.58-1.71l5.59 5.59.7-.71zM10 16c-3.31 0-6-2.69-6-6s2.69-6 6-6 6 2.69 6 6-2.69 6-6 6z"></path></svg></div></icon-shape></yt-icon-shape></yt-icon>
  <tp-yt-paper-tooltip prefix="" class="style-scope ytd-searchbox" role="tooltip" tabindex="-1" style="left: 345.911px; top: 62px;"><!--css-build:shady--><div id="tooltip" class="style-scope tp-yt-paper-tooltip hidden" style-target="tooltip">
  Search
</div>
</tp-yt-paper-tooltip>
</button>*/
		By searchbuttonproperty=By.id("search-icon-legacy");
		WebElement searchbutton=Driver.findElement(searchbuttonproperty);
		searchbutton.click();
		
		
	
	}

}
