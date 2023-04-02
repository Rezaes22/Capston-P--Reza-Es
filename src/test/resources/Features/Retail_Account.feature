Feature: Retail account page

  Background: 
    Given user is on retail website
    When User click on sign in option
    And User enter email 'Reza20001@gmail.com' and password 'Kingofdarkness12@'
    And User click on login button
    Then User should be logged in into Account

@updateinfo
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'openthedopp' and Phone '8444447232434'
    And User click on Update button
    Then user profile information should be updated

@updatepassword
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Kingofdarkness12@        | darkness2@21   | darkness2@21      |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’

@addcart
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 3241144423579993 | REZAESMaeil       |              11 |           2030 |          875 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

@editcard
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1234577723445553 | REZADark        |              11 |           2025 |          123 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

@removecard
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

@address
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country    | fullName | phoneNumber   | streetAddress | apt | city | state   | zipCode |
      | Tajikistan | first    | 3231323982323 | noneedy       | top | toy  | Khatlon |   21833 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

@editAddress
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below informations
      | country    | fullName | phoneNumber   | streetAddress | apt | city | state   | zipCode |
      | Tajikistan | noname   | 3231323232323 | nomom         | opo | lop  | Khatlon |   21833 |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’

@removeacc
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
