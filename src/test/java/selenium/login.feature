Feature: Find flights using Musafir website
@Seleniumtest
Scenario Outline: Find flights between source and destination
Given user has navigated to Musafir website
When user clicks on OneWay flight options
When user enters <source> and <destination>
Then user clicks Date
And user clicks Find Flights
And user is successfully navigated to flight options page
Examples:
|source|destination|
|TRV   | DEL      |