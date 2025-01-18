Feature: create company

  Scenario: create new company
    Given user open application
    When user login
    And user click on companies link
    And user click on create
    And user enter company name
    And user select public
    And user click save
    Then company will be created

    Scenario: create new company without name

      Given user open application
      When user login
      And user click on companies link
      And user click on create
      And user enter address
      And user select public
      And user click save
      Then The field Name is required message should be displayed


