Feature: FB login page

@smoke
Scenario Outline: FB - Login validation with Multiple data
Given user opens the chrome browser
When user enters the url
Then FB login page is displayed
When user enters "<username>" and password is "<password>"
When user clicks on login button
Examples:
|username|password|
|pradeep@gmail.com|password123|
|raju@gmail.com|password123|
|pradeep1234@gmail.com|password123|
|jyothi@gmail.com|password123|


@raju
	Scenario: To validate URL of the practice form
	Given user opens the chrome browser
	When user enteres url
	Then user able to see practice form
	And user verifies Practice Form and Student Registration Form text
	And jyothi wants new step
	
	
	@jyothi
	Scenario: To validate URL of the practice form
	Given user opens the chrome browser
	When user enteres url
	Then user able to see practice form
	And user verifies Practice Form and Student Registration Form text
	And raju wants new step
	
	@raju
	Scenario: To validate URL of the practice form
	Given user opens the chrome browser
	When user enteres url
	Then user able to see practice form
	And user verifies Practice Form and Student Registration Form text
	
	
	@pradeep @jyothi
	Scenario: To validate URL of the practice form
	Given user opens the chrome browser
	When user enteres url
	Then user able to see practice form
	And user verifies Practice Form and Student Registration Form text