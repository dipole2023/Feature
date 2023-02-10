package com.demoshop.tests;

import org.testng.annotations.Test;

import com.demoshop.main.Base_Class_Browser;

public class ComputerPageTests extends Base_Class_Browser {

	@Test(description = "GCL_AUT02 - Purchase a desktop computer.")
	public void purchaseCheapComputer() throws Exception {
		// Logged-in with registered user
		funLibrary.login();
		
		//Validate home page 
		getPages.getComputerPage().computerLink().selectDesktopComputer().selectDesktopType("cheap")
			.selectCpu("slow").selectRam("2gb").selectHdd("320gb").selectSoftware(true, true, false).addToCart();
			
			
	}
}