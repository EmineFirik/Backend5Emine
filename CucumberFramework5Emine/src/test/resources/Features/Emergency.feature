#Author: your.email@your.domain.com
Feature: Add Emergency contact details

  Background: 
    Given user is logged in with valid credentials
    And user navigates to AddEmployee page
    When user enters employee first name "Cristiann" and last name "Ronaldd"
    And user selects a location
    And user clicks on save button
    Then validate that employee "Cristiann Ronaldd" is added successfully
    
    
@addEmergency
    Scenario: Add Emergency Contact Fetail
    When user click More button
    Then click Emergency Contacts
    Then click pluss button
    Then add emergency  "Gorgiana" and "spose" and "201 000 00 00" and "200 000 00 00" and "202 000 00 00"  acontact details
    Then click  emergency save button
    