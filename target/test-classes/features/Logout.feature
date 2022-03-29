Feature: To verify Automation Practice Form of Toolsqa
	
	Scenario: To validate URL of the practice form
	Given user opens the chrome browser
	When user enteres url "https://demoqa.com/automation-practice-form"
	Then user able to see practice form
	And user verifies Practice Form and Student Registration Form text
	When user enters "Pradeep" and "M" in Firstname and lastname textboxes
	And user enters "raju@gmail.com" "77777777777" and "Selenium"
	When user enters "Pradeep" as firstname "M" as lastname "pradeep@gmail.com" as email "8888888888" as mobileno and "selenium" as subject
	When user enters "Pradeep" as firstname "M" as lastname "pradeep@gmail.com" as email 8888888888 mobileno and "selenium" as subject
	
	
	