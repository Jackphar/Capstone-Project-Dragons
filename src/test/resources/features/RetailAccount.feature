@regression
Feature: Retail Account

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'jackphar1@tekschool.us' and password 'Tek@12345'
    And User click on login button
    And User should be logged into Account
    When User click on Account option

  @updateProfile @regression
  Scenario: Verify User can update Profile Information
    And User update Name 'KaKaDastageer' and Phone '916-234-4565'
    And User click on Update button
    Then user profile information should be updated

  @addPaymentMethod @regression
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 5567567890123434 | Ali        |              10 |           2029 |          120 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added sucessfully'

  @editPaymentMethod @regression
  Scenario: Verify User can edit Debit or Credit card
    And User click on the payment card
    And User click on Edit option of card section
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 8765092387457878 | Dastageer  |              10 |           2030 |          787 |
    And user click on Update Your Card button
    Then this message should be displayed 'Payment Method updated Successfully'

  @removePaymentMethod @regression
  Scenario: Verify User can remove Debit or Credit card
    And User click on the payment card
    And User click on remove option of card section
    Then payment details should be removed

  @addAddress @regression
  Scenario: Verify User can add an Address
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName | phoneNumber  | streetAddress | apt | city       | state      | zipCode |
      | United States | Esmat    | 916 234 3434 | Cris Str      |  12 | Sacramento | California |   34212 |
    And User click Add Your Address button
    Then the message should be displayed 'Address Added Successfully'

  @editAddress @regression
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And user fill new address form with below information
      | country     | fullName  | phoneNumber  | streetAddress | apt | city  | state | zipCode |
      | Afghanistan | JanAli | 123 456 1908 | Karte Char    |  09 | Kabul | Kabul |   34345 |
    And User click update Your Address button
    Then This message should be displayed 'Address Updated Successfully'

  @removeAddress @regression
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
