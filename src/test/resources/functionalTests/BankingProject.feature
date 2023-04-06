@banking
Feature: Test the functionality of banking domain

  Scenario: Test the banking operations in customer login
    Given I enter the url of banking domain
    When I click customer login
    And select the account name "Harry Potter"
    And deposit amount of dollar "500"
    And withdraw amount of dollar "200"
    Then I validate the transcation and reset it
    And I have logged out

  Scenario Outline: create and delete the bank account in manager login
    Given I enter the url of banking domain
    When I click bank manager login
    And select add customer and provide required details <firstname> <lastname> <postcode>
    And open account for the created customer <firstname> <lastname> <currency>
    And delete the created customer <firstname>

    Examples: 
      | firstname | lastname     | postcode | currency |
      | "Luna"    | "Lovebottom" | "EA5695" | "Dollar" |
      | "Rubeus"  | "Hagrid"     | "EA5995" | "Pound"  |
