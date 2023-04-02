Feature: Retail SignIn feature

@Signin
  Scenario: Verify user can sign in into retail Aplication
    Given user is on retail website
    When User click on sign in option
    And User enter email 'Reza20001@gmail.com' and password 'Kingofdarkness12@'
    And User click on login button
    Then User should be logged in into Account
    Then User click on log out button

@createaccount
  Scenario: Verify user can create an account into Retail Website
    Given user is on retail website
    When User click on sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name        | email               | password  | confirmPassword |
      | reza | ytrfgv654@tekschool.us | rezaese@s321 | rezaese@s321       |
    And User click on SignUp button
    Then User should be logged into account page
