package com.demoshop.tests;
import org.testng.annotations.Test;

import com.demoshop.main.Base_Class_Browser;

public class DigitalPageTest extends Base_Class_Browser{
	
	@Test(description = "DWS_AUTO1 - Verify digital download items and display")
	public void verifyDigitalPage() throws Exception {
		//Click on digital downloads page
		getPages.getDigitalPage().clickDigital().verifyPageTitle();
		
	}
	
	@Test(description = "DWS_AUTO2 - Sort by high to low")
	public void sortByLowToHigh() throws Exception {
		//Open digital page and Click on the sort by dropdown
		getPages.getDigitalPage().clickDigital().sortByPriceLowHigh();
		
	}

}
