Feature: Test functionality of Employee Api
For sample testing we should check the functionality of Employee api

Scenario: Get List Users
Given Give the domain name of Employee
When send the get request with the resource url
Then validate the response code 

Scenario: Get single User
Given Give the domain name of Employee
When send the get request with the single resource url
Then validate the response code get

Scenario: create new User
Given Give the domain name of Employee
When add user in server
Then validate the post response code

Scenario: Update a User
Given Give the domain name of Employee
When update user in server
Then validate the response code

Scenario: delete a User
Given Give the domain name of Employee
When delete user in server
Then validate the response code


