Feature: Create A Form

  Scenario: Create new form

    Given user open application
    When user login
    And user click on Forms link
    And user click on Add
    And user enter form's name
    And user check Active option
    And user enter Introduction text
    And user click save button
    Then new form will be created