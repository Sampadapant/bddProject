Feature: Login with multiple user
  I want to verify login with multiple users

  Scenario Outline: Login 
    Given user navigates to sauce lab
    When I enter Username as "<username>" and Password as "<password>"
    Then login should be successful

    Examples: 
      | username        | password     |
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |