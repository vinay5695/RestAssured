@ui
Feature: Test the Json Place Holder UI

  
  Scenario: Try the run script
    Given I enter the url of the json place holder
    When I click the run script button
    Then I validate the response

  
  Scenario: Test the post response
    Given I enter the url of the json place holder
    When I click the posts url
    Then I validate the response for httpmethods it contains "at nam consequatur ea labore ea harum"

  
  Scenario: Test the comments response
    Given I enter the url of the json place holder
    When I click the comments url
    Then I validate the response for httpmethods it contains "ex eaque eum natus"

  
  Scenario: Test the albums response
    Given I enter the url of the json place holder
    When I click the albums url
    Then I validate the response for httpmethods it contains "enim repellat iste"

  
  Scenario: Test the photos response
    Given I enter the url of the json place holder
    When I click the photos url
    Then I validate the response for httpmethods it contains "error quasi sunt cupiditate voluptate ea odit beatae"

  
  Scenario: Test the todos response
    Given I enter the url of the json place holder
    When I click the todos url
    Then I validate the response for httpmethods it contains "ipsam aperiam voluptates qui"

  
  Scenario: Test the users response
    Given I enter the url of the json place holder
    When I click the users url
    Then I validate the response for httpmethods it contains "Centralized empowering task-force"

  
  Scenario: Test the getpost response
    Given I enter the url of the json place holder
    When I click the getpost url
    Then I validate the response for httpmethods it contains "at nam consequatur ea labore ea harum"

  
  Scenario: Test the getpost1 response
    Given I enter the url of the json place holder
    When I click the getpost1 url
    Then I validate the response for httpmethods it contains "sunt aut facere repellat provident occaecati excepturi optio reprehenderit"

  
  Scenario: Test the getpostcomments response
    Given I enter the url of the json place holder
    When I click the getpostcomments url
    Then I validate the response for httpmethods it contains "vero eaque aliquid doloribus et culpa"

  
  Scenario: Test the postcomments response
    Given I enter the url of the json place holder
    When I click the postcomments url
    Then I validate the response for httpmethods it contains "vero eaque aliquid doloribus et culpa"
