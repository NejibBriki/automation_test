package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.AjoutProduitPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AjoutProduitStepDefinition {

	public AjoutProduitPage ajoutProduitPage;

	public AjoutProduitStepDefinition() {
		ajoutProduitPage = new AjoutProduitPage();
	}

	@When("Je clique sur bouton add new")
	public void jeCliqueSurBoutonAddNew() {
		AjoutProduitPage.getBtnAdd().click();
	}

	@When("je saisi nom de produit {string}")
	public void jeSaisiNomDeProduit(String name) {
		AjoutProduitPage.getName().clear();
		AjoutProduitPage.getName().sendKeys(name);
	}

	@When("je saisi une description {string}")
	public void jeSaisiUneDescription(String description) {
		AjoutProduitPage.getDescription().clear();
		AjoutProduitPage.getDescription().sendKeys(description);
	}

	@When("je clique sur le bouton save")
	public void jeCliqueSurLeBoutonSave() {
		AjoutProduitPage.getBtnSave().click();
	}

	@Then("je verifie que le produit est bien ajoute")
	public void jeVerifieQueLeProduitEstBienAjoute() {

	}

}
