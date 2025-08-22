Feature: check user is able to login with valid credetials
Scenario Outline: succesful login
Given login page opened in def browser
When click on <email> and <password>

Then login is success
Examples:
|email|password|
|ravadapriyankael.6@gmail.com|Priya@678|

