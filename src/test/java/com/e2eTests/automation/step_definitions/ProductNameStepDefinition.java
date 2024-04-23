package com.e2eTests.automation.step_definitions;


import com.e2eTests.automation.page_objects.ProductNamePage;

import io.cucumber.java.en.When;

public class ProductNameStepDefinition {
	
	public ProductNamePage productNamePage;

	public ProductNameStepDefinition() {
		productNamePage = new ProductNamePage();
	}
	
	@When("Je clique sur Catalog")
	public void jeCliqueSurCatalog() {
		ProductNamePage.getMenuCatalog().click();
	}
	@When("Je clique sur Products")
	public void jeCliqueSurProducts() {
		ProductNamePage.getMenuProduct().click();
	}
	
	@When("je clique sur le menu de recherche")
	public void jeCliqueSurLeMenuDeRecherche() {
	   ProductNamePage.getOptionSearch().click();;
	}
	
	@When("Je saisis le nom du produit {string}")
	public void jeSaisisLeNomDuProduit(String nameProduit) {
		
		
		ProductNamePage.getProductName().sendKeys(nameProduit);
		
	}
	@When("Je clique sur le bouton search")
	public void jeCliqueSurLeBoutonSearch() {
	}

}