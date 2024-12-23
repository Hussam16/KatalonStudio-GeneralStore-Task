package mySamplePackage
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement

import pom.CartPage
import pom.LoginPage
import pom.ProductPage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class addProductStep {

	LoginPage loginPage = new LoginPage()
	ProductPage productPage = new ProductPage()
	CartPage cartPage = new CartPage()
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I open the General Store app")
	def openTheApp() {

		loginPage.openApp()
	}

	@When("I select 'Egypt' from the country dropdown")
	def selectCountry() {
		loginPage.selectCountry()
	}

	@And("I enter 'Hussam' in the name field")
	def enterName() {

		loginPage.enterName()
	}

	@And("I select 'Male' as the gender")
	def enterGender() {
		loginPage.selectGender()
	}

	@And("I click on the 'Let's Shop' button")
	def continueShopping() {

		loginPage.clickShopButton()
	}

	@And("I add two products to the cart")
	def addProductsCart() {


		productPage.addProductsToCart()
	}




	@And("I verify that the products are displayed")
	def verifyProductsDisplayed() {

		cartPage.verifyProducts()
	}

	@And("I verify that the total amount equals total")
	def verifyTotalPrice() {
		cartPage.verifyTotalAmount()
	}


	@Then("I navigate to the cart screen")
	def openTheCart() {


		productPage.navigateToCart()
	}
}