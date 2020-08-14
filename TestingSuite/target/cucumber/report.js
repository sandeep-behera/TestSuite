$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Testing to validate Login",
  "description": "",
  "id": "testing-to-validate-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login-Application"
    }
  ]
});
formatter.before({
  "duration": 7108541200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Validate Login Functionality",
  "description": "",
  "id": "testing-to-validate-login;validate-login-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Login-positive"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user navigates to the website \"URL\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "there user logs in through Login Window by using Username as \"USER\" and Password as \"PASSWORD\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "login must be successful.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "URL",
      "offset": 31
    }
  ],
  "location": "LoginAppSteps.user_navigates_to_the_website(String)"
});
formatter.result({
  "duration": 9096612000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "USER",
      "offset": 62
    },
    {
      "val": "PASSWORD",
      "offset": 85
    }
  ],
  "location": "LoginAppSteps.there_user_logs_in_through_Login_Window_by_using_Username_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 4540706200,
  "status": "passed"
});
formatter.match({
  "location": "LoginAppSteps.login_must_be_successful()"
});
formatter.result({
  "duration": 129900,
  "status": "passed"
});
formatter.after({
  "duration": 1534663900,
  "status": "passed"
});
});