package com.demoshop.pages;


import com.demoshop.main.FunLibrary;

public class HomePage extends FunLibrary {

	//accessing my account after account.
	public HomePage clickMyAccountLink() {
		ExplicitWait(OR_OR.getProperty("accountlink"), "accountlink", 10);
		Click_Button_Xpath(OR_OR.getProperty("accountlink"), "accountlink");
		return this;
	}

	// function clicking logout.
	public HomePage clickLogout() {
		ExplicitWait(OR_OR.getProperty("logoutlink"), "logoutlink", 1);
		// click logout link
		Click_Button_Xpath(OR_OR.getProperty("logoutlink"), "logoutlink");
		// wait(2000);
		return this;
	}

	public HomePage validatePageTitle() {
		wait(2000);
		String title = driver.getTitle();
		if (title.contentEquals("Demo Web Shop. Account")) {
			testLog.info("Demo Web Shop. Account");
		} else {
			testLog.error("Title is incorrect");
			assertCheck("validatePageTitle", "Title is incorrect");
		}
		return this;
	}
	
}
