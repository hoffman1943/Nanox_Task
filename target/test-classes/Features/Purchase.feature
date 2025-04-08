Feature: feature to test test purchase

  Scenario Outline: check user can purchase product
    Given user is on home page <page>
    When user choose product
    And clicks on add to cart
    And go to cart
    And complete purchase insert <name> <country> <city> <credit_card> <month> <year>
    Then purchase complete successfully 

    Examples: 
      | page| name | country | city | credit_card | month | year |
      | https://www.demoblaze.com/| sharon | israel | givatyim | 4523424 | 03 | 2029 |
