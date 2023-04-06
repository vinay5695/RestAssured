Feature: Test the SwagLab UI

  Background: Login the swaglab sauce
    Given url of the page
    When enter username and password
      | standard_user | secret_sauce |
    Then log in succuessfully

  @sauce
  Scenario: order a product
    When I click add to cart of backpack
    And I checkout the product
    Then I validate the product order and logged out

  @sauce
  Scenario: order a product
    When I click add to cart of bikelight
    And I checkout the product
    Then I validate the product order and logged out

  @sauce
  Scenario: order a product
    When I click add to cart of tshirt
    And I checkout the product
    Then I validate the product order and logged out

  @sauce
  Scenario: order a product
    When I click add to cart of jacket
    And I checkout the product
    Then I validate the product order and logged out

  @sauce
  Scenario: order a product
    When I click add to cart of onesie
    And I checkout the product
    Then I validate the product order and logged out

  @sauce
  Scenario: order a product
    When I click add to cart of redtshirt
    And I checkout the product
    Then I validate the product order and logged out
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
