package com.demoshop.pages;

import com.demoshop.main.FunLibrary;

public class ComputerPage extends FunLibrary {
	
	// Waits for the computer tab to appear on the store page and click it.
	public ComputerPage computerLink() {
		Click_Button_Xpath(OR_OR.getProperty("computerlink"), "Computer link");
		return this;
	}
	
	public ComputerPage selectDesktopComputer() {
		Click_Button_Xpath(OR_OR.getProperty("desktopoption"), "Desktop Option");
		return this;
	}
	
	public ComputerPage selectNotebookComputer() {
		Click_Button_Xpath(OR_OR.getProperty("notebookoptions"), "Notebook Option");
		return this;
	}
	
	/*
	 * Computer Store
	 * */
	
	public ComputerPage selectCheapDesktop() {
		Click_Button_Xpath(OR_OR.getProperty("cheapcomputer"), "Cheap Desktop");
		return this;
	}
	
	public ComputerPage selectExpensiveDesktop() {
		Click_Button_Xpath(OR_OR.getProperty("expensivecomputer"), "Expensive Desktop");
		return this;
	}
	
	
}
