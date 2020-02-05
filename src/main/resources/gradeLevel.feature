Feature: Create a  GradeLevel

  Scenario Outline: GradeLevel creating
    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameters
    And Click on gradelevel
    And Click on plus icon
    And Type the gradelevel name "<name>"
    And Type the shortName "<shortname>"
    And Type the order "<order>"
    When Click on save button
    Then "<name>" should be displayed
    And Remove the data "<name>"
    Then Verify data is removed "<name>"
    Examples:
      | name | shortname | order |
      | esra | esr       | 0     |

