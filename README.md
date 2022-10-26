# TestVagrantProjectCucumberIMDB
This repository contains a collection of sample selenium-cucumber-java projects and libraries that demonstrate how to use the tool and develop automation script using the Cucumber (v 7.3.4) BDD framework with Java as programming language. It also generate screen shots for your tests if you enable it and also generate error shots for your failed test cases as well.
# Installation (pre-requisites)
JDK 1.8+ (make sure Java class path is set)

Maven (make sure .m2 class path is set)

Eclipse Plugins for
Maven
Cucumber

Browser driver (make sure you have your desired browser driver and class path is set)
# Directory Structure
![26 10 2022_01 15 21_REC](https://user-images.githubusercontent.com/116420907/197931039-046e6275-a013-47b9-af1c-e7ce33c95b8b.png)
# Features File
All feature files in Cucumber should have the extension .feature in its name. If .feature is not present, then cucumber won’t recognize it as a feature file
![26 10 2022_01 15 59_REC](https://user-images.githubusercontent.com/116420907/197931227-af4464f7-b99f-467f-9a28-78686d43dbf7.png)
# POM
POM is a design pattern which is commonly used in Selenium for Automating the Test Cases
![26 10 2022_01 48 56_REC](https://user-images.githubusercontent.com/116420907/197931286-85a0cb95-0c47-4d98-afa3-8c9db780926e.png)
# Step Defination
A Step Definition is a Java method with an expression that links it to one or more Gherkin steps. When Cucumber executes a Gherkin step in a scenario, it will look for a matching step definition to execute.
To illustrate how this works, look at the following Gherkin Scenario
![26 10 2022_09 33 45_REC](https://user-images.githubusercontent.com/116420907/197931940-a21c47f1-0da8-4908-b1bf-b2e89676f4e5.png)
# Test Runner
TestRunner File is used to build a Communication between Feature Files and StepDefinition Files.
![26 10 2022_01 15 59_REC](https://user-images.githubusercontent.com/116420907/197931750-edddfe5e-7239-4a2d-ac23-f9514f087c56.png)
# Logs
A logging framework is a utility specifically designed to standardize the process of logging in your application.
![26 10 2022_01 37 56_REC Logs](https://user-images.githubusercontent.com/116420907/197932093-e23fb414-9773-421a-b118-73b0034390f1.png)
# Reports
Once you ran your tests you can generate the various types of reports. This framework selenium-cucumber-java uses several different types of test reporters to communicate pass/failure.
![26 10 2022_01 17 34_REC](https://user-images.githubusercontent.com/116420907/197932230-074b85e6-4093-450e-8065-5e2f8d991f1e.png)
# Instruction To Execute Test
We Can Trigger The Automation Manualy By Eclipse *Open Eclipse Goto testng.xml File Then Click Right Click *Select TestNG/JUnit Test

Or

We Can Trigger The Automation Using Jenkins *Open Jenkins Select New Item *Give Name Of The Item Select Maven Project *Enter Description And Source Code Mannagement Select Git *In Side Git Enter Url *Then Move To Build Inside Root Pom Enter "pom.xml" *In Goals And Options Enter "test" *Select Build Now
![26 10 2022_09 38 16_REC](https://user-images.githubusercontent.com/116420907/197932389-332c814b-12f1-451d-bb5b-885789156a63.png)
