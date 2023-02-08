package com.demoshop.pages;

import com.demoshop.main.FunLibrary;
//import com.gocllect.utilities.DatabaseUtilities;

public class LoginPage extends FunLibrary {
	
	//click login in refernces. 
	public LoginPage clickLogin() throws Exception {
		// click on login link to enable customer login fields.
		Click_Button_Xpath(OR_OR.getProperty("loginlink"), "loginlink");
		return this;

	}

	//login into demo webshop application.
	public LoginPage shopLogin() {
		// Enter valid Email id.
		Clear_Text(OR_OR.getProperty("emailid"), "emailid");
		Sendkey_xpath(OR_OR.getProperty("emailid"), EmailID, "emailid");
		// Enter valid password.
		Clear_Text(OR_OR.getProperty("password"), "password");
		Sendkey_xpath(OR_OR.getProperty("password"), password, "password");
		// click on login button.
		Click_Button_Xpath(OR_OR.getProperty("loginbutton"), "login button");
		return this;

	}

}
