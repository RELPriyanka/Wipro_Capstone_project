Feature: check the search functionality
Scenario Outline: successful 
Given login user and search button in browser

When enter <item>
Then list of output relevant to input
Examples:
|item|
|watch|
|bag|
|phone|