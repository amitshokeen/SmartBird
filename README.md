[![Allure Report](https://img.shields.io/badge/Allure-Report-blue)](https://amitshokeen.github.io/SmartBird/)

**To get going:**
* These are some sample pieces of Java code to brush up on Interfaces, and Dependency Injection
* JUnit5 has been used to write simple unit tests.
* Allure reports have been configured to provide a test run report.
* Build automation is done using Maven. 
* Go through the pom.xml in the root
* To make sure Maven downloads all dependencies: `mvn clean install`
* To Build and test on local terminal: `mvn clean test`
* .github/workflows/ci.yml > Github Actions > after you push your changes onto the repo, it will generate a report and publish the test results allure report here: https://amitshokeen.github.io/SmartBird/  