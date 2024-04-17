package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.CategoriesNamePage;


import io.cucumber.java.en.When;

public class CategoriesNameStepDefinition {

	public CategoriesNamePage categoriesNamePage;

	public CategoriesNameStepDefinition() {
		categoriesNamePage = new CategoriesNamePage();
	}

	@When("Je clique sur Categories")
	public void jeCliqueSurCategories() {
		CategoriesNamePage.getBtnCategories().click();

	}
	
	@When("Je saisis le nom du catégorie {string}")
	public void jeSaisisLeNomDuCatégorie(String string) {
		CategoriesNamePage.getBtnSearchCategories().sendKeys("book");

	}

}
