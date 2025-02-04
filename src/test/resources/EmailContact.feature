Feature: Add Email Contact

  Scenario: Add new email contact

    Given user open application
    When user login
    And user click on email link
    And user click on compose
    And user click on Add contact button
    And user enter first name
    And user enter last name
    And user enter valid email
    And user click on Add button

