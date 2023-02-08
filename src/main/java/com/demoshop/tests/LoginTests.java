package com.demoshop.tests;

import org.testng.annotations.Test;

import com.demoshop.main.Base_Class_Browser;

public class LoginTests extends Base_Class_Browser {

	@Test(description = "GC_AUT01 - Verify user logged-in successfully with valid user")
	public void validateUserLoginWithValidCredentials() throws Exception {
		// Validating user logged-in
		getPages.getLoginPage().clickLogin().shopLogin();
		

	}

}
