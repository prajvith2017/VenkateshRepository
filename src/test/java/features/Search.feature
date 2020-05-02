Feature: Search and place order for vegetables

@Smoke
Scenario: Search for items and validate for results
Given User is on Greencart Landing page
When User searched for Cucumber Vegetable
Then "Cucumber" results are displayed

@Regression
Scenario Outline:: Search for the item and move to the chekout page
Given User is on Greencart Landing page
When User searched for <VegetableName> Vegetable
And Add items to cart
And User proceeded to Checkout page for purchase
Then Verify selected <VegetableName> items are dispyaled in Checkout page

Examples:
|VegetableName|
|Brinjal|
|Brocolli|
|Beetroot|



