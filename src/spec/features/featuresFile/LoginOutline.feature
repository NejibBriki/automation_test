@outline
Feature: Connexion avec plusieurs comptes
  ETQ utilisateur je souhaite me connecter avec plusieurs comptes

  @connexion_multiUsers
  Scenario Outline: Je souhaite me connecter avec plusieurs comptes
    Given Je visite l'application NopCommerce
    When Je saisis l'adresse mail "<email>"
    And Je saisis le login "<login>"
    And Je clique sur le bouton Login
    Then Je verifie le message "<message>"

    Examples: 
      | email               | login | message                                                          |
      | admin@yourstore.com | admin | Dashboard                                                        |
      | mouna@gmail.com     | mouna | Login was unsuccessful. Please correct the errors and try again. |
      | ahmed@gmail.com     | ahmed | Login was unsuccessful. Please correct the errors and try again. |

      
      
      