

Feature: Integation test of booking a hotel
	
	
  Scenario: User uses login 
    Given user is in home page
    When user enters username and password in respective fields
    And user clicks on login button
    Then user is navigated to the search hotel page
	
  Scenario: user searches for the given hotel
    Given user is in search hotel page
    When user enters the needed fields of the search
    And user clciks submits
    Then user navigated to the select hotel page
    
  
  Scenario: Hotel selected and proceeded
  	Given user is in the hotel selection page
  	When user selects the hotel
  	And user clicks on continue
  	Then user is navigated to the Book Hotel page

  Scenario: Personal info is entered
  	Given user is in info entering page
  	When user enters the necessary fields
  	And user clicks on Book now
  	Then user is navigated to Conformation page
  
  Scenario: user log outs
  	Given user need to log out
  	When user clicks on logout button
  	Then user is navigated to log out page

  
