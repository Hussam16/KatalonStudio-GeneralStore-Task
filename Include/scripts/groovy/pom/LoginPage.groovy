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

class LoginPage {

	static openApp() {
		// Code to open the General Store app
//		Mobile.startApplication('C:\\Users\\workstation\\Downloads\\General-Store.apk', true)
		Mobile.startApplication('Apps/General-Store.apk', true)
		
	}

	static selectCountry() {
		// Code to select the country from the dropdown
		Mobile.tap(findTestObject('Object Repository/LoginScreen/Country_Dropdown'), 0)
		Mobile.scrollToText('Egypt')
		Mobile.tap(findTestObject('Object Repository/LoginScreen/Country_Name'), 0)
	}

	static enterName() {
		// Code to enter name
		Mobile.setText(findTestObject('Object Repository/LoginScreen/Name_Field'), 'Hussam', 0)
		Mobile.hideKeyboard()
	}

	static selectGender() {
		// Code to select gender
	}

	static clickShopButton() {
		Mobile.tap(findTestObject('Object Repository/LoginScreen/Start_Shopping'), 0)
	}
}



