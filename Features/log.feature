
Feature: login to application

  Scenario: Successfully login to application
    Given launch browser 
    When open url
    And enter valid username and password
    And click on sign-in
    Then  user successfully login into facebook
   


