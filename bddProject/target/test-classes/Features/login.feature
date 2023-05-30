Feature: Login
 
  Scenario: login with valid credentials
    Given I am in sauce lab login page
    When I enter valid username
    And I enetr valid password
    And I click on login button
    Then I will go on homepage
    

 
 