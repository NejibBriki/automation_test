package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class AjoutProduitPage extends BasePage {

	/* Retrieve element */
	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	private static WebElement btnAdd;

	@FindBy(how = How.XPATH, using = "//input[@id='Name']")
	private static WebElement name;

	@FindBy(how = How.XPATH, using = "//textarea[@id='ShortDescription']")
	private static WebElement description;

	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	private static WebElement btnSave;

	public AjoutProduitPage() {
		super(Setup.getDriver());
	}

	public static WebElement getBtnAdd() {
		return btnAdd;
	}

	public static WebElement getName() {
		return name;
	}

	public static WebElement getDescription() {
		return description;
	}

	public static WebElement getBtnSave() {
		return btnSave;
	}

}
