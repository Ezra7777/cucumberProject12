Feature: Create a Fees
  Scenario:  Fees creating


    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameters
    And Click on fee
    And Click on plus icon
    And Type the  feename "esra"
    And Type the  feecode "esr"
    And Type in Feepriority "0"
    When Click on save button
    Then "esra" should be displayed
    And Remove the data "esra"
    Then Verify data is removed "esra"
