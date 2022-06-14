

Feature: Integration test of OrangeHRM (login > add employee > read that specific employee from list )
  
  Scenario: login fucntion check
    Given user is in the login page of OrangeHRM
    When user enter the user name and password
    And user clicks the login button
    Then navigated to the Dashboard page

  Scenario: adding an employee
    When user click on Add employee in PIM tree
    Then navigated to the add Employee page

  Scenario: Add employee check
  	Given user is in the add employee page
  	When user enters the first, middle, last name
  	And user chooses photograph
  	And user creates login details
  	And user clicks on submit
  	Then navigated to the Personl details page
  	
  Scenario: Integration of add employee in list check
  	Given user clicks on employee list on PIM dropdown
  	And user is in employee list page
  	When user enters the details on search fields
  	And user clicks on recently added employee
  	Then validate the information given there
