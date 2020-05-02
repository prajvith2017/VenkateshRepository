Feature: Applicatin login

Background:
Given User launch the browser
And User enter the URL

@Accounts
Scenario: Home page defualt login
Given User is on landing page
When User loin into application with username "venkatesh" and password "abc123"
Then Home page is populated
And Cards are displayed is "true"

@Accounts
Scenario: Home page defualt login
Given User is on landing page
When User loin into application with username "abhi" and password "abhi123"
And User enter the followig registration form
|venkatesh|manepalli|venkisoft56@gmail.com|9989026726|
Then Home page is populated
And Cards are displayed is "false"


@Accounts
Scenario Outline:Home page defualt login
Given User is on landing page
When User loin in to application with different <Username> and <Password>
Then Home page is populated
And Cards are displayed is "false"

Examples:
|Username|Password|
|user1|pass1|
|user2|pass2|
|user3|pass3|


