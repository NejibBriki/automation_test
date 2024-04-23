package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.LoginPage;
import com.e2eTests.automation.page_objects.LogoutPage;
import com.e2eTests.automation.utils.ConfigFileReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefinition {
	
	public LogoutPage logoutPage;

	public LogoutStepDefinition() {
		logoutPage = new LogoutPage();
		
	}
	

	@When("je clique sur logout")
	public void jeCliqueSurLogout() {
	    
		LogoutPage.getBtnLogout().click();
	}
	@Then("je me rederige vers la page de connexion")
	public void jeMeRederigeVersLaPageDeConnexion() {
	    
	}




}
