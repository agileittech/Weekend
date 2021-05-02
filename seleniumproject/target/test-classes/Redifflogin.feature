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
@Rediffmaillogin
Feature: Login into Rediffmail page
I need to have an account in Rediff.com to test this feature

  @Login
  Scenario Outline: Login into rediffmail using username and password
    Given To Open Url of Rediffmail Page in <Browser>
    When the page is successfully opened enter username
    And  Enter <password>
    Then Click on signin button

    Examples: 
      | Browser  | password |
      | Chrome   | 12345678 |
      | Firefox  | 12345678 |
