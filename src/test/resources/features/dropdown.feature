
Feature: Ways a dropdown value can be select

  Background:
    Given The user open test page
    Then the dropdown have a new value
  @WithSearchBox
  Scenario: Drop Down with Search box
    When select a country

  @Multi
  Scenario: Multi Select - Search and Select multiple states
    When select some states

  @Simple
  Scenario: Drop-down with Category related options
    When select a file