@ui
Feature: Book an appointment in katalon heroku UI

  Background: Login the katalon application
    Given I enter the katalon url of the login
    When I enter username and password of katalon
      | John Doe | ThisIsNotAPassword |
    Then I validate katalon login successfully

  Scenario: Make appointment in katalon demo UI
    When I select the facility in dropdown as "Hongkong CURA Healthcare Center"
    And click checkbox for hospital readmission
    And select healthcare program radio button
    And select visit date
    And add comments
    And Book appointment
    Then I validate appointment confirmed and logged out
