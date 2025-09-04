Feature: check user is able to subscribed with valid credetials
Scenario Outline: succesful
Given log page open in deff browser
When give input in the <email> field
Then email entered successfully
Examples: 
|email|
|priya.enj4@gmail.com|
