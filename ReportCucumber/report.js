$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/AddProducts.feature");
formatter.feature({
  "name": "Add Products to Cart in General Store App",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add two products to the cart and verify the total amount",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I open the General Store app",
  "keyword": "Given "
});
formatter.match({
  "location": "addProductStep.openTheApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \u0027Egypt\u0027 from the country dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "addProductStep.selectCountry()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \u0027Hussam\u0027 in the name field",
  "keyword": "And "
});
formatter.match({
  "location": "addProductStep.enterName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \u0027Male\u0027 as the gender",
  "keyword": "And "
});
formatter.match({
  "location": "addProductStep.enterGender()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the \u0027Let\u0027s Shop\u0027 button",
  "keyword": "And "
});
formatter.match({
  "location": "addProductStep.continueShopping()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add two products to the cart",
  "keyword": "And "
});
formatter.match({
  "location": "addProductStep.addProductsCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the cart screen",
  "keyword": "Then "
});
formatter.match({
  "location": "addProductStep.openTheCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that the products are displayed",
  "keyword": "And "
});
formatter.match({
  "location": "addProductStep.verifyProductsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that the total amount equals 100.00",
  "keyword": "And "
});
formatter.match({
  "location": "addProductStep.verifyTotalPrice()"
});
formatter.result({
  "status": "passed"
});
});