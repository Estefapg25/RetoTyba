Feature: I as a customer need to be able to buy items from the popular items

  @SuccessfulPurchaseSafePay
  Scenario Outline: Validate that the user can purchase a product from popular items with Safe Pay
    Given that the customer enters the shopping page
    And enter your login data
      | <username> | <password> |
    When select product characteristics and payment method
      | <safePayName> | <safePayPassword> |
    Then customer sees Thank you for buying with Advantage message on the payment order

    Examples:
      | username  | password     | safePayName | safePayPassword |
      | test16387 | Prueba16386* | testpago    | Prueba16386*    |


  @SuccessfulPurchaseMasterCard
  Scenario Outline: Validate that the user can purchase a product from popular items with MasterCard
    Given that the customer enters the shopping page
    And enter your login data
      | <username> | <password> |
    When select product characteristics and payment method
      | <cardNumber> | <cvvNumber> | <month> | <year> | <cardholderName> |
    Then customer sees Thank you for buying with Advantage message on the payment order

    Examples:
      | username  | password     | cardNumber       | cvvNumber | month | year | cardholderName |
      | test16386 | Prueba16386* | 1020304050607080 | 222       | 10    | 2026 | Test           |


