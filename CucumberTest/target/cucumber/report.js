$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('features\TC1.feature');
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author:"
    }
  ],
  "line": 3,
  "name": "TC1",
  "description": "",
  "id": "tc1",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Login functionality exists",
  "description": "",
  "id": "tc1;login-functionality-exists",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I have open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I open Facebook website",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Login button should exits",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberJava.openBrowser()"
});
formatter.result({
  "duration": 574355265,
  "status": "passed"
});
formatter.match({
  "location": "cucumberJava.goToFacebook()"
});
formatter.result({
  "duration": 431615,
  "status": "passed"
});
formatter.match({
  "location": "cucumberJava.loginButton()"
});
formatter.result({
  "duration": 346805,
  "status": "passed"
});
formatter.uri('features\TC2.feature');
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author:"
    }
  ],
  "line": 3,
  "name": "TC2",
  "description": "",
  "id": "tc2",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Login functionality exists",
  "description": "",
  "id": "tc2;login-functionality-exists",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I have open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I open Facebook website",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Login button should exits",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberJava.openBrowser()"
});
formatter.result({
  "duration": 11663328,
  "status": "passed"
});
formatter.match({
  "location": "cucumberJava.goToFacebook()"
});
formatter.result({
  "duration": 444039,
  "status": "passed"
});
formatter.match({
  "location": "cucumberJava.loginButton()"
});
formatter.result({
  "duration": 507242,
  "status": "passed"
});
});