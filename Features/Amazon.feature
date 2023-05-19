Feature: Add to cart the product

  Scenario: product should be added to cart
    Given launching the browser
    And login to url
    When select the product
    And add the product to cart
    And check the cart
