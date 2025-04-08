Feature: feature to test login functionality

  Scenario Outline: check login is successfull with valid credentails
    Given user is on login <page>
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the home page

    Examples: 
      | page| username            | password  |
      | https://www.demoblaze.com/| hoffmanqt@gmail.com | hoffmanqt |
