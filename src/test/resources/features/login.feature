
Feature: Login facebook's page


  Scenario: The user does a Login successfully
    Given The user open facebook's page
    When enter the access data
    Then The user redirected to the home page

  Scenario Outline: Some users does a Login successfully
    Given The user open facebook's page
    When enter <username> and <pass>
    Then The user redirected to the home page
    Examples:
      |username|pass|
      |3016827692|test1234|
