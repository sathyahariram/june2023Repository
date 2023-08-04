Feature: Login scenarios for salesforce

Scenario: Login into application with valid username and password1

Given User is on the "LoginPage"
When User enter into TextBox "Username" "SathyaHariram@tekarch.com" 
When User enter into TextBox "Password" " "
Then User Clicks on Button "Login"

Scenario: Login into application with valid username and password4B

Given User is on the "LoginPage"
When User enter into TextBox "Username" "123" 
When User enter into TextBox "Password" "22131"
Then User Clicks on Button "Login"
And Validate Username "ErrorMessage" "Please check your username and password. If you still can't log in, contact your Salesforce administrator."

Scenario: Login into application with valid username and password2

Given User is on the "LoginPage"
When User enter into TextBox "Username" "SathyaHariram@tekarch.com" 
When User enter into TextBox "Password" "Mysalesforce@222"
Then User Clicks on Button "Login"
Given User is on the "HomePage"
Then User Clicks on Button "Usermenu"



Scenario: Login into application with valid username and password4A

Given User is on the "LoginPage"
When User enter into TextBox "Username" "SathyaHariram@tekarch.com"
Then User Clicks on CheckBox "ForgotPassword"
Then User Clicks on Button "Continue"

@Test
Scenario: Login into application with valid username and password3
Given User is on the "LoginPage"
When User enter into TextBox "Username" "SathyaHariram@tekarch.com" 
When User enter into TextBox "Password" "Mysalesforce@222"
Then User Clicks on CheckBox "Rememberme"
Then User Clicks on Button "Login"
Given User is on the "HomePage"
Then User Clicks on Button "Usermenu"
Then User Clicks on Button "Logout"
Then User Switch Window "LoginpageafterLogout"
Given User is on the "LoginpageafterLogout"
And Validate Username "UsernameafterLogout" "sathyahariram@tekarch.com"

