Feature: Find mobiles using Flipkart website
@Searchtest
Scenario Outline: Find mobiles in Flipkart website
Given user has navigated to Flipkart website
When user enters "mobiles" in the search box
And clicks on the search button
Then the mobile devices are displayed successfully on the next page
And the item is successfully added to the cart