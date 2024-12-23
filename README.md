# Mobile Automation Project

This project is designed for automating mobile application testing using Katalon Studio. It incorporates the Cucumber framework for behavior-driven development (BDD) and follows the Page Object Model (POM) to ensure modularity, maintainability, and scalability.

---

## Project Structure

### 1. **Test Cases**
- Contains test cases for automation:
  - `CucumberRunnerTestcase`: Entry point to execute the feature file(s).
  - `FeatureFileTestCase`: Additional test case for feature-based execution.

### 2. **Object Repository**
- Organizes and stores object locators for application screens:
  - `CartScreen`: Elements for the cart functionality.
  - `LoginScreen`: Elements for login functionality.
  - `Product_Screen`: Elements for product-related operations.


### 3. **Include**
- Key subfolders:
  - **features**: Holds Cucumber feature files for defining scenarios.
  - **scripts**: Contains Groovy scripts for step definitions, POM classes, and the Cucumber runner.




## Key Features

1. **Cucumber Framework**:
   - Enables writing test scenarios in Gherkin syntax for better readability and collaboration.
   
2. **Page Object Model (POM)**:
   - Screens and functionalities are modularized into reusable components for enhanced maintainability.



## Prerequisites

1. **Katalon Studio**:
   - Ensure the latest version of Katalon Studio is installed.
   
2. **Appium Setup**:
   - Install and configure Appium to run mobile tests.
   
3. **APK Path**:
   - Update the APK path in the test script before running the tests:
     ```groovy
     Mobile.startApplication('/path/to/your/app.apk', false)
     ```

---

## Running Tests

1. Clone the project and open it in Katalon Studio.
2. Update the APK path in the relevant test scripts.
3. Execute the `CucumberRunnerTestcase` to run the tests:
   - This will trigger the feature file(s) for execution.

---

## Reporting


- Cucumber-specific reports are available in the designated folder for further insights.

---
