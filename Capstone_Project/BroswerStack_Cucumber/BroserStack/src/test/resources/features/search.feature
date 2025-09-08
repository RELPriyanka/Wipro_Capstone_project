Feature: check user is able to input in the search field
Scenario Outline: succesfully entered
Given logi page open in def browser
When give multiple search <input>
Then search is successful
Examples: 
|input|
|apple|
|oneplus|
|samsung|
|google|