Feature: check user is able to change the address
Scenario Outline: succesfully changed
Given login page in def browser
When clicked on <lastn> and <city1> fields

Then successed in changing
Examples:
|lastn|city1|
|Eswari Priya|Visakhapatnam|
