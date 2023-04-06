@ui
Feature: Test the Demoqa UI Login and order book

  #Scenario: Register the Demoqa application
  #Given I enter the demoqa url
  #When I enter required details and click login button
  #|vinay|A|vinayA@gmail.com|vinayA@123|
  #Then I validate the registered successfully
  Background: login the Demoqa application
    Given I enter the demoqa url of the login "login"
    When I enter username and password
      | vinayB@gmail.com | vinayB@123 |
    Then I validate login successfully

  Scenario: Add and Delete books in collection
    Given I enter the demoqa url of the books
    When I click the book
    And add the book into my collection
    And Delete all books in my collection
    Then I logged out demo qa
