Feature: Raju and Jyothi wants to execute some code

Background:
	Given user opens the chrome browser
	When user enteres url
	Then user able to see practice form
	And user verifies Practice Form and Student Registration Form text
	
	@raju
	Scenario: To validate URL of the practice form
		Then jyothi wants new step

	@jyothi
	Scenario: To validate URL of the practice form
	And raju wants new step
	
	