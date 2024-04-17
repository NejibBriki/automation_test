@productname @tnr
Feature: Recherche nom produit
  ETQ utilisateur je souhaite chercher le nom du produit

  @productName
  Scenario: Je souhaite chercher le nom du produit
    Given Je visite l'application NopCommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    And Je saisis le login "admin"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home
    And Je clique sur Catalog
    And Je clique sur Products
    And je clique sur le menu de recherche
    And Je saisis le nom du produit "parfum"
    And Je clique sur le bouton search