Feature: feature to test categories pages

  Scenario Outline: check user can view all categories
    Given open home page <page>
    When user choose category phones
    And phones category page opened
    And user choose category laptops
    And laptops category page opened
    And user choose category monitors
    And monitors category page opened
    Then all categories load successfully 

    Examples: 
      | page|
      | https://www.demoblaze.com/|
