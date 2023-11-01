Feature: Scenarios with DataTable

  #@dataTable
  Scenario: Add Employee with DataTable
    When I loggin to the HRMS
    And I want to add Employees
      | FirstName | MiddleName | LastName |
      | Emine     | Mine       | Firik    |
      | Mesut     | Alp        | Erol     |
      | Yasemin   | Yasmin     | Koc      |
    Then I validate employee is added
