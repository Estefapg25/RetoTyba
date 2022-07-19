Feature: I as a customer need to be able to register a new user

  @SuccessfulRegistration
  Scenario Outline: Validate the registration of a new customer
    Given that the customer enters the shopping page
    And he enters the option to create new account
    When he enters the required information
      | <username> | <email> | <password> |
    Then the customer can see the logged-in
      | <username> |

    Examples:
      | username   | email               | password     |
      | test163855 | test16386@gmail.com | Prueba16386* |


  @existingUser
  Scenario Outline: Validate that an error occurs when the entered user already exists in the database.
    Given that the customer enters the shopping page
    And he enters the option to create new account
    When he enters the required information
      | <username> | <email> | <password> | <confirmPassword> |
    Then the customer can see the error message on screen User name already exists


    Examples:
      | username  | email               | password     | confirmPassword |
      | test16386 | test16386@gmail.com | Prueba16386* | Prueba16386*    |