Feature: check user is able to logout or not
Scenario: succesful logout
Given login page opened in def browserr
When click on logout
Then logout is success