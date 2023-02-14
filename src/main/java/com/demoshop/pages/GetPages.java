/**
 * 
 */
package com.demoshop.pages;

public class GetPages {
	private LoginPage loginPage = null;
	private HomePage homePage = null;
	private ComputerPage computerPage = null;
	private DigitalPage digitalPage = null;

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
	
	//Digital Download page
		public DigitalPage getDigitalPage() {
			if (digitalPage == null) {
				return new DigitalPage();
			} else {
				return digitalPage;
			}
		}
}
