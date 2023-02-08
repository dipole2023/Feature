package com.demoshop.tests;

import org.testng.annotations.Test;

import com.demoshop.main.Base_Class_Browser;

public class ComputerPageTests extends Base_Class_Browser {

	@Test(description = "GCL_AUT02 -Verify Home page is loaded successfully")
	public void pressComputerTab() throws Exception {
		// Logged-in with registered user
		funLibrary.login();
		
		//Validate home page 
		getPages.getComputerPage().computerLink().selectDesktopComputer().selectCheapDesktop();


	}
}