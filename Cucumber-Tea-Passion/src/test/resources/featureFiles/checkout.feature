 Feature: Testing the checkout feature of the Website Tea Passion. Positive test. Cancel order after placing details.
 
  @Checkout
  Scenario Outline: Testing checkout
    Given I am at the website.
    And I have checked out after selecting a product
    When I am redirected to the checkout page
    Then I verify that the input fields are present
    And The submit button is present
    And the cancel button is present
    When I input "<email_address>" in the email field
    Then The "<email_address>" appears in the email field
    When I input the "<name>" 
    Then the "<name>" appears in the name field
    When I input the address
    Then the address appears in the address field
    When I input the Card number
    Then The card number appears in the card number field
    When I input the cardholder_name 
    Then The cardholder_name appears in the cadholder name field
    When I input the verification_code
    Then the verification_code appears in the verfication code field
    When I click the Cancel button
    Then I am redirected to the menu page


    Examples: 
      | email_address | name |
      | hellothere123@gmail.com | Maria |
 