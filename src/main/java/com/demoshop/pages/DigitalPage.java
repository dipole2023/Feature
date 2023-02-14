package com.demoshop.pages;
import com.demoshop.main.FunLibrary;

public class DigitalPage extends FunLibrary {

	/**
	 * Click on the Digital Downloads tab
	 */
	public DigitalPage clickDigital() throws Exception {
		//Click on the digital downloads link on the home page banner
		Click_Button_Xpath(OR_OR.getProperty("digital-link"), "digitaldownloadlink");
		return this;
	}
	
	public DigitalPage verifyPageTitle() {
		wait(2000);
		String title = driver.getTitle();
		if (title.contentEquals("Demo Web Shop. Digital downloads")) {
			testLog.info("Demo Web Shop. Digital downloads");
		} else {
			testLog.error("Title is incorrect");
			assertCheck("validatePageTitle", "Title is incorrect");
		}
		return this;
	}
	
	
	public DigitalPage sortByPriceLowHigh() {
		sort_by(OR_OR.getProperty("sortby"), "Price: Low to High");
		return this;
	}
	
	public DigitalPage selectMusic10Dollars() {
		Click_Button_Xpath(OR_OR.getProperty("music2$10"), "music2-$10");
		return this;
	}
	
}
