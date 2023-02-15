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
	
	/**
	 * 
	 * @param products in the digital downloads page
	 * -music$10 = Music 2 $10
	 * -music$3 = Music 2 $3
	 * -album3 = 3rd Album
	 * @return selects the specified value in the param
	 */
	public DigitalPage selectProduct(String product) {
		Click_Button_Xpath(OR_OR.getProperty(product), product);
		return this;
	}
	
	/**
	 * Clears the qty field and then passes the specified qty into the field
	 * @param qty for the quantity field in the selected product page
	 * @return specified qty into qty field of web-app
	 */
	public DigitalPage enterQty(Integer qty) {
		//clear quantity field & enter 2 for qty
		Clear_Text("quantity", "quantity");
		Sendkey_xpath(OR_OR.getProperty("quantity"), qty.toString(), "quantity");
		return this;
	}
	
	/**
	 * 
	 * @return click/select the add to cart button
	 */
	public DigitalPage addToCart() {
		Click_Button_Xpath("addtocart", "Add to cart");
		return this;
	}
	
	public DigitalPage calculateTotal() {
		get_xpath_text("unitprice", "Unit price");
	}
	
}
