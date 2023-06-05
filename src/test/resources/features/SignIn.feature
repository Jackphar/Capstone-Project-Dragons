@regression
Feature: Retail SignIn

  Background: 
    Given User is on retail website
    When User click on Sign in option

  @signIn @regression
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'jackphar1@tekschool.us' and password 'Tek@12345'
    And User click on login button
    Then User should be logged into Account

  @createAccount @regression
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name    | email                       | password  | confirmPassword |
      | Ali | alibaba1598@tekschool.us | Tek@12345 | Tek@12345       |
    And User click on SignUp button
    Then User should be logged into account page
