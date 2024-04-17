package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class CategoriesNamePage extends BasePage{
	
	/* Retrieve element */
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Categories']")
	private static WebElement btnCategories ;
	
	@FindBy(how = How.ID, using = "SearchCategoryName")
	private static WebElement btnSearchCategories;
	
	
	
	public CategoriesNamePage() {
		super(Setup.getDriver());
	}
	
	public static WebElement getBtnCategories() {
		return btnCategories;
	}
	
	public static WebElement getBtnSearchCategories() {
		return btnSearchCategories;
	}
}



