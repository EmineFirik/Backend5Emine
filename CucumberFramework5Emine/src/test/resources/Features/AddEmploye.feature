@AddEmployee
Feature: Implement Add Employee Feature and steps for each scenerio

  @smoke 
  Scenario: AddEmploye with first and last name
    Given user is logged in with valid credentials
    And click Pim and Employee
    Then enter username ans password
    And select location
    And click save

  @smoke
  Scenario: Add Employee without employee id
    Given user is logged in with valid credentials
    And click Pim and Employee
    Then enter username ans password
    And select location
    And delete ID
    And click save

  @smoke
  Scenario: Add employee and create login Credentials
    Given user is logged in with valid credentials
    And click Pim and Employee
    Then enter username ans password
    And select location
    Then create login credentials
    And add create username and password
    And click save

  @emine
  Scenario: Displayed personel detatil
    Given user is logged in with valid credentials
    And click Pim and Employee
    Then enter username ans password
    And select location
    Then create login credentials
    And add create username and password
    And click save
    Given user is navigate personel detail
    Then verify the personel name
