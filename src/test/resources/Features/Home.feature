Feature: Retail Page application

  #(1)
  Scenario: Verify user can search a product
    Given user is on retail website
    When user search for 'Pokemon' item
    Then Product should be displayed

  #(2)
  Scenario: Verify Shop by Department sidebar
    Given user is on retail website
    When User click on All section
    Then below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  #(3)
  Scenario Outline: Verify department sidebar options
    Given user is on retail website
    When User click on All section
    And User on <department>
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department    | optionOne                      | optionTwo                |
      | 'Electronics' | TV & Video                     | Video Games              |
      | 'Computers'   | Accessories                    | Networking               |
      | 'Smart Home'  | Smart Home Lightning           | Plugs and Outlets        |
      | 'Sports'      | Athletic Clothing              | Exercise & Fitness       |
      | 'Automotive'  | Automative Parts & Accessories | MotorCycle & Powersports |

  #(4)
  Scenario: Verify User can add an item to cart
    Given user is on retail website
    When User click on sign in option
    And User enter email 'mommad.tariq@tekschool.com' and password 'Tareq123@'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button

  #(5)
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    Given user is on retail website
    When User click on sign in option
    And User enter email 'mommad.tariq@tekschool.com' and password 'Tareq123@'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And user fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city    | state      | zipCode |
      | United States | onlytop  |  1234567890 | top5          |  55 | Modesto | California |   33333 |
    And User click Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1448867877771278 | topy       |               6 |           2023 |          555 |
    And User click on Add your card button
    And User click on Place Your Order

  #(6)
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    Given user is on retail website
    When User click on sign in option
    And User enter email 'mommad.tariq@tekschool.com' and password 'Tareq123@'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search icon
    And User click on items
    And User select quantity '5'
    And User click add to Cart button
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
