Feature: Add Products to Cart in General Store App

  Scenario: Add two products to the cart and verify the total amount
    Given I open the General Store app
    When I select 'Egypt' from the country dropdown
    And I enter 'Hussam' in the name field
    And I select 'Male' as the gender
    And I click on the 'Let's Shop' button
    And I add two products to the cart
    Then I navigate to the cart screen
    And I verify that the products are displayed
    And I verify that the total amount equals total
