Feature: Login

  Scenario Outline: "User" logs in with valid credentials
    Given User is in Login page
    When  User submit '<Email>' and '<Password>'
    Then  '<UserName>' is displayed in Main Page
    Examples:
      |Email|Password|UserName|
      |vitaliybugayev+1@gmail.com|Rbuga41010!|Test|

  Scenario Outline: "User" logs in with invalid credentials
      Given User is in Login page
      When User submit '<Email>' and '<Password>'
      Then User not logged in
      Examples:
        |Email|Password|
        |AAAAA|BBBBB|
        |12312312|asdadad|
        |----------|------|