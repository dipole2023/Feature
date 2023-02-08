/**
 * 
 */
package com.demoshop.pages;

public class GetPages {
	private LoginPage loginPage = null;
	private HomePage homePage = null;
	private ComputerPage computerPage = null;

	// Login Page
	public LoginPage getLoginPage() {
		if (loginPage == null) {
			return new LoginPage();
		} else {
			return loginPage;
		}
	}

	// Home page
	public HomePage getHomePage() {
		if (homePage == null) {
			return new HomePage();
		} else {
			return homePage;
		}
	}
	
	// Computer page
	
	public ComputerPage getComputerPage() {
		if (homePage == null) {
			return new ComputerPage();
		} else {
			return computerPage;
		}
	}
}
