@Login-Application
Feature: Testing to validate Login
@Login-positive
Scenario: Validate Login Functionality
Given user navigates to the website "URL"
And there user logs in through Login Window by using Username as "USER" and Password as "PASSWORD"
When User clicks Login Button
Then login must be successful.