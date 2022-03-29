Feature: FB login page

@smoke
Scenario: FB - Login validation with Multiple data
Given user opens the chrome browser
When user enters the url
Then FB login page is displayed
When user enters "<username>" and password is "<password>"
|pradeep@gmail.com|password123|
|raju@gmail.com|password123|
|pradeep1234@gmail.com|password123|
|jyothi@gmail.com|password123|
When user clicks on login button


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



Scenario: To validate URL of the practice form
	Given user opens the chrome browser
	When user enteres url "https://demoqa.com/automation-practice-form"
	Then user able to see practice form
	And user verifies Practice Form and Student Registration Form text
	When user enters "Pradeep" and "M" in Firstname and lastname textboxes
	And user enters "raju@gmail.com" "77777777777" and "Selenium"
	When user enters "Pradeep" as firstname "M" as lastname "pradeep@gmail.com" as email "8888888888" as mobileno and "selenium" as subject
	When user enters "Pradeep" as firstname "M" as lastname "pradeep@gmail.com" as email 8888888888 mobileno and "selenium" as subject
	
	
	