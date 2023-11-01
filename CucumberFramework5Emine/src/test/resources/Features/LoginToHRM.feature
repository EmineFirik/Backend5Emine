@background
Feature: : Login fuctionality

  @smoke
  Scenario: Valid Login
    When I enter a valid username
    And I enter a valid password
    And I click login button
    Then I validate that I am logged in

  @regression
  Scenario: Invalid Password
    When I enter a valid username
    And I enter aninvalid password
    And I click login button
    Then I validate Invalid Credential

  @outline
  Scenario Outline: : Login usung Scenario Outline
    When user enters login info "<username>" and "<password>"
    And I click in the login button
    Then Welcome  "<firstName>" message is displayed

    Examples: 
      | username | password    | firstName        |
      | Admin    | Neotech@123 | Jacqueline White |
      | Test     | Tester@123  | Test             |
      | Test1    | Tester@1234 | Test1            |

  @HW3
  Scenario: Login user DataTable
    When user enters username and password and clicks on login
      | username | password    | firstName        |
      | Admin    | Neotech@123 | Jacqueline White |
      | Admin    | Neotech@123 | Jacqueline White |
