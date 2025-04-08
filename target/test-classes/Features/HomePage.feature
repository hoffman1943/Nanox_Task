Feature: Go to demoblazePage

  Scenario: Validate demoblaze is loading
    Given browser is open
    When user is on the right <page>
    Then elements of page is visable

    
  Examples: 
  
     | page | 
     | https://www.demoblaze.com/ |