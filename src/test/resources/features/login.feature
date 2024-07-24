Feature: Login Functionality
	
	Scenario: Successful Login
		Given I am on the login page
		When I enter valid username and password
		And I click on the login button
		Then I should be logged into the application
	
	Scenario Outline: Successful Login with Different Users
		Given I am on the login page
		When I enter "<username>" and "<password>"
		And I click on the login button
		Then I should be logged into the application
		
		Examples:
			| username | password |
			| user1    | password1 |
			| user2    | password2 |
			| user3    | password3 |
			| admin    | admin123  |