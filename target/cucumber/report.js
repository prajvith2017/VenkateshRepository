$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Search.feature");
formatter.feature({
  "name": "Search and place order for vegetables",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search for items and validate for results",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SeleniumTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Greencart Landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.MyStepDefinitions.user_is_on_greencart_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searched for Cucumber Vegetable",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.MyStepDefinitions.user_searched_for_vegetable(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Cucumber\" results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.MyStepDefinitions.something_results_are_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": ": Search for the item and move to the chekout page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SeleniumTest"
    }
  ]
});
formatter.step({
  "name": "User is on Greencart Landing page",
  "keyword": "Given "
});
formatter.step({
  "name": "User searched for \u003cVegetableName\u003e Vegetable",
  "keyword": "When "
});
formatter.step({
  "name": "Add items to cart",
  "keyword": "And "
});
formatter.step({
  "name": "User proceeded to Checkout page for purchase",
  "keyword": "And "
});
formatter.step({
  "name": "Verify selected \u003cVegetableName\u003e items are dispyaled in Checkout page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "VegetableName"
      ]
    },
    {
      "cells": [
        "Brinjal"
      ]
    },
    {
      "cells": [
        "Brocolli"
      ]
    },
    {
      "cells": [
        "Beetroot"
      ]
    }
  ]
});
formatter.scenario({
  "name": ": Search for the item and move to the chekout page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SeleniumTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Greencart Landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.MyStepDefinitions.user_is_on_greencart_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searched for Brinjal Vegetable",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.MyStepDefinitions.user_searched_for_vegetable(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add items to cart",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.MyStepDefinitions.add_items_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User proceeded to Checkout page for purchase",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.MyStepDefinitions.user_proceeded_to_checkout_page_for_purchase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify selected Brinjal items are dispyaled in Checkout page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.OrderStepDefinitions.verify_selected_items_are_dispyaled_in_checkout_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": ": Search for the item and move to the chekout page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SeleniumTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Greencart Landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.MyStepDefinitions.user_is_on_greencart_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searched for Brocolli Vegetable",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.MyStepDefinitions.user_searched_for_vegetable(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add items to cart",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.MyStepDefinitions.add_items_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User proceeded to Checkout page for purchase",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.MyStepDefinitions.user_proceeded_to_checkout_page_for_purchase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify selected Brocolli items are dispyaled in Checkout page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.OrderStepDefinitions.verify_selected_items_are_dispyaled_in_checkout_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": ": Search for the item and move to the chekout page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SeleniumTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Greencart Landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.MyStepDefinitions.user_is_on_greencart_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searched for Beetroot Vegetable",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.MyStepDefinitions.user_searched_for_vegetable(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add items to cart",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.MyStepDefinitions.add_items_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User proceeded to Checkout page for purchase",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.MyStepDefinitions.user_proceeded_to_checkout_page_for_purchase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify selected Beetroot items are dispyaled in Checkout page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.OrderStepDefinitions.verify_selected_items_are_dispyaled_in_checkout_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});