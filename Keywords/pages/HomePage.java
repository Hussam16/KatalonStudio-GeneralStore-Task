package pages;

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords;
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject;

import com.kms.katalon.core.testobject.TestObject;

public class HomePage {

    // Select Country
    public void selectCountry(String country) {
        TestObject countryDropdown = findTestObject("Object Repository/CountryDropdown");
        TestObject countryOption = findTestObject("Object Repository/CountryOption_" + country);

        MobileBuiltInKeywords.tap(countryDropdown, 10);
        MobileBuiltInKeywords.scrollToText(country);
        MobileBuiltInKeywords.tap(countryOption, 10);
    }
}
