package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class LogoutPage  extends BasePage {
	
	
	/* Retrieve element */
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Logout']")
	private static WebElement btnLogout;
	
	public LogoutPage() {
		super(Setup.getDriver());
	}
	
	public static WebElement getBtnLogout() {
		return btnLogout;
	}
	
	

}
