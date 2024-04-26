@addNewProduct @tnr
Feature: Ajouter un nouveau produite produit
  ETQ utilisateur je souhaite ajouter un nouveau produit

  Background: 
       Given Je visite l'application NopCommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    And Je saisis le login "admin"
    And Je clique sur le bouton Login
    And Je clique sur Catalog
    And Je clique sur Products
   

  @ajoutpdt
  Scenario: Je souhaite ajouter un nouveau produit
    
   
    When Je clique sur bouton add new
    And je saisi nom de produit "clavier"
    And je saisi une description " clavier sans fil"
    And je clique sur le bouton save
    Then je verifie que le produit est bien ajoute
    When je clique sur logout
    Then je me rederige vers la page de connexion

    
     