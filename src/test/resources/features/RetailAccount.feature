Feature: Retail Account

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'testuser@test.us' and password 'Tek@12345'
    And User click on login button
    And User should be logged into Account
    When User click on Account option

  @updateProfile
  Scenario: Verify User can update Profile Information
    And User update Name 'Sam' and Phone '916-234-1234'
    And User click on Update button
    Then user profile information should be updated

  @addPaymentMethod
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 5567567890124444 | Fardin     |               8 |           2030 |          890 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added successfully'

  @editPaymentMethod
  Scenario: Verify User can edit Debit or Credit card
    And User click on the payment card that ends with '5555'
    And User click on Edit option of card section
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 8765092387450909 | Adam        |              10 |           2042 |          787 |
    And user click on Update Your Card button
    Then this message should be displayed 'Payment Method updated Successfully'

  @removePaymentMethod
  Scenario: Verify User can remove Debit or Credit card
    And User click on the payment card that ends with '3456'
    And User click on remove option of card section
    Then payment details should be removed

  @addAddress
  Scenario: Verify User can add an Address
    And User click on Add address option
    And user fill new address form with below information
      | country     | fullName | phoneNumber  | streetAddress  | apt | city     | state | zipCode |
      | Spain | Nadia    | 916-234-3434 | 342 Cris Str |  12 | SpanCity | Barcelona |   34212 |
    And User click Add Your Address button
    Then the message should be displayed 'Address Added Successfully'

  @editAddress
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And user fill new address form with below information
      | country | fullName | phoneNumber  | streetAddress  | apt | city  | state | zipCode |
      | India   | Ajmal   | 123-456-0098 | 123 Lajpat Str |  56 | Dehli | Bihar |   84653 |
    And User click update Your Address button
    Then This message should be displayed 'Address Updated Successfully'

  @removeAddress
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
