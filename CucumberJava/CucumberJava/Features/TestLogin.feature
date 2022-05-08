#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login Action
  

  @tag1
  Scenario: Successful login with valid credentials
    Given User in Login page
    When User view login page successfully
    And User enters  "tomsmith" and "SuperSecretPassword!"
    Then Message displayed login successfully
    
    Scenario: Wrong username 
    Given User in Login page
    When User view login page successfully
    And User enters  "wrongUser" and "SuperSecretPassword!"
    Then Message displayed your username is invalid
    
    Scenario: Wrong Password 
    Given User in Login page
    When User view login page successfully
    And User enters  "tomsmith" and "WrongPassword"
    Then Message displayed your password is invalid
    