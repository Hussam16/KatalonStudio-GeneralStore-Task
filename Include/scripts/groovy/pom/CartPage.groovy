package pom

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

class CartPage {


	static	Double convertToDouble(String price) {
		return price.replace('$', '').toDouble()
	}

	static verifyProducts() {
		// Code to verify that products are displayed
		Mobile.verifyElementText(findTestObject('Object Repository/CartScreen/Air Jordan 4 Retro'), 'Air Jordan 4 Retro')

		Mobile.verifyElementText(findTestObject('Object Repository/CartScreen/Air Jordan 1 Mid SE'), 'Air Jordan 1 Mid SE')
	}

	static verifyTotalAmount() {
		// Code to verify total amount
		String x=Mobile.getText(findTestObject("Object Repository/CartScreen/Price_one"), 0)
		String x2=Mobile.getText(findTestObject("Object Repository/CartScreen/Price_two"), 0)
		String x3=Mobile.getText(findTestObject("Object Repository/CartScreen/total_price"), 0)

		Double price1Double = convertToDouble(x)
		Double price2Double = convertToDouble(x2)
		Double totalDouble = convertToDouble(x3)

		Double calculatedTotal = price1Double + price2Double

		//		if (calculatedTotal == totalDouble) {
		//
		//			KeywordUtil.logInfo("The sum of $x and $x2 is equal to $x3.")
		//			Mobile.verifyEqual(calculatedTotal, totalDouble, FailureHandling.CONTINUE_ON_FAILURE)
		//		} else {
		//			KeywordUtil.logWarning("The sum of $x and $x2 is NOT equal to $x3.")
		//			Mobile.verifyEqual(calculatedTotal, totalDouble, FailureHandling.STOP_ON_FAILURE)
		//		}

		Mobile.verifyEqual(calculatedTotal, totalDouble)
		Mobile.closeApplication()
	}
}