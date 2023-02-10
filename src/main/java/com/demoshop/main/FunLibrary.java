package com.demoshop.main;

import static org.testng.Assert.fail;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;

import com.demoshop.pages.GetPages;
import com.demoshop.pages.LoginPage;

//import com.swiftshop.pages.SuperBarPage;

public class FunLibrary extends SelLibrary {

	public static String RandomGeneratedUsername = null;

	public Logger testLog = Logger.getLogger("debugLogger:" + Thread.currentThread().getId());

	public int random_bag_flag = -1;

	public String method_name = "";
	public String password = "";
	public String EmailID = "";
	public String test_data = "";
	public GetPages getPages;
	public String customer = "";
	public String productName = "";
	public String BinToDeliver = "";
	public String QtyToPick = "";
	public String QtyToDeliver="";
	public String Site="";
	public String SiteContact="";
	public String OrderBy="";
	public String binLocation="";
	public String driver_firstname = "";

	public FunLibrary() {
		load_Obj_Repository();
		getExcelData(sheet_name);
		getPages = new GetPages();
	}

	public void getExcelData(String sheetname) {
		EmailID = datatable.getCellData(sheet_name, "EmailID", currentRow);
		password = datatable.getCellData(sheet_name, "password", currentRow);
		customer = datatable.getCellData(sheet_name, "customer", currentRow);
		productName = datatable.getCellData(sheet_name, "productname", currentRow);
		BinToDeliver = datatable.getCellData(sheet_name, "bintodelivery", currentRow);
		QtyToPick = datatable.getCellData(sheet_name, "qtypick", currentRow);
		QtyToDeliver = datatable.getCellData(sheet_name, "qtydelivery", currentRow);
		Site = datatable.getCellData(sheet_name, "site", currentRow);
		SiteContact = datatable.getCellData(sheet_name, "sitecontact", currentRow);
		OrderBy = datatable.getCellData(sheet_name, "orderby", currentRow);
		binLocation = datatable.getCellData(sheet_name, "binlocation", currentRow);
		driver_firstname = datatable.getCellData(sheet_name, "search", currentRow);
	}

	public void login() {
		try {
			testLog.info("Logging in...");
			if (!(EmailID.equals(""))) {
				testLog.info("Email id for test is: " + EmailID);
				testLog.info("password for test is: " + password);
				LoginPage loginpage = new LoginPage();
				loginpage.clickLogin().shopLogin();
				wait(2000);
				testLog.info("Login successful.");
			} else {
				testLog.error("Username is blank.");
				fail("login failed!! Username is blank.");
			}

		} catch (Exception e) {
			testLog.error("login failed!!");
			fail("login failed!!");
		}
	}

	public void scrollTo_Pixel(int x, int y) {
		try {
			wait(2000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(" + x + "," + y + ")", "");
			testLog.info("Scrolled successfully");
			wait(3000);
		} catch (Exception e) {
			testLog.error("Issue in scrolling");
			assertCheck("scrollTo_Pixel", "Unable to scroll to given pixels", "X:" + x + ", Y:" + y, e);
		}
	}



	// Function to return the full day name (ex: MON) provided
	


}
