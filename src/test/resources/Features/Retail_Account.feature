Feature: Retail account page

  Background: 
    Given user is on retail website
    When User click on sign in option
    And User enter email '' and password ''
    And User click on login button
    Then User should be logged in into Account

  #(1) Scenario
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'openthedopp' and Phone '1104447232434'
    And User click on Update button
    Then user profile information should be updated

  #(2) Scenario
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Topeq123@        | Tomtom123@  | Tomtom123@      |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’

  #(3) Scenario
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1231144423579993 | opo        |              10 |           2030 |          456 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  #(4) Scenario
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1234577723445553 | nba        |              11 |           2031 |          123 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

  #(5) Scenario
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

  #(6) Scenario
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country    | fullName | phoneNumber   | streetAddress | apt | city | state   | zipCode |
      | Tajikistan | first    | 3231323232323 | noneedy       | top | toy  | Khatlon |   21233 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

  #(7) Scenario
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below informations
      | country    | fullName | phoneNumber   | streetAddress | apt | city | state   | zipCode |
      | Tajikistan | noname   | 3231323232323 | nomom         | opo | lop  | Khatlon |   21233 |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’

  #(8) Scenario
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
