$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test_spec.feature");
formatter.feature({
  "id": "bueyer",
  "description": "",
  "name": "Bueyer",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "bueyer;the-buyer-navigates-to-home-tab",
  "description": "",
  "name": "The buyer navigates to home tab",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "The bueyer goes to the ws",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "The bueyer tries to log in",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "he goes to inbox",
  "keyword": "And ",
  "line": 6
});
formatter.step({
  "name": "all invoices are displayed",
  "keyword": "Then ",
  "line": 7
});
formatter.match({
  "location": "ProgramTestSteps.The_bueyer_goes_to_the_ws()"
});
formatter.result({
  "duration": 10195433280,
  "status": "passed"
});
formatter.match({
  "location": "ProgramTestSteps.The_bueyer_tries_to_log_in()"
});
formatter.result({
  "duration": 4195093313,
  "status": "passed"
});
formatter.match({
  "location": "ProgramTestSteps.he_goes_to_inbox()"
});
formatter.result({
  "duration": 21168,
  "status": "passed"
});
formatter.match({
  "location": "ProgramTestSteps.all_invoices_are_displayed()"
});
formatter.result({
  "duration": 20847,
  "status": "passed"
});
formatter.scenario({
  "id": "bueyer;the-buyer-is-unsuccessfully-login",
  "description": "",
  "name": "The buyer is unsuccessfully login",
  "keyword": "Scenario",
  "line": 11,
  "type": "scenario"
});
formatter.step({
  "name": "The bueyer goes to the ws",
  "keyword": "Given ",
  "line": 12
});
formatter.step({
  "name": "The bueyer tries to log in with incorrect credentials",
  "keyword": "When ",
  "line": 13
});
formatter.step({
  "name": "He is not successfully login",
  "keyword": "Then ",
  "line": 14
});
formatter.match({
  "location": "ProgramTestSteps.The_bueyer_goes_to_the_ws()"
});
formatter.result({
  "duration": 9170662189,
  "status": "passed"
});
formatter.match({
  "location": "ProgramTestSteps.The_bueyer_tries_to_log_in_with_incorrect_credentials()"
});
formatter.result({
  "duration": 454575428,
  "status": "passed"
});
formatter.match({
  "location": "ProgramTestSteps.He_is_not_successfully_login()"
});
formatter.result({
  "duration": 1077444500,
  "status": "passed"
});
formatter.scenario({
  "id": "bueyer;the-buyer-is-successfully-login",
  "description": "",
  "name": "The buyer is successfully login",
  "keyword": "Scenario",
  "line": 17,
  "type": "scenario"
});
formatter.step({
  "name": "The bueyer goes to the ws",
  "keyword": "Given ",
  "line": 18
});
formatter.step({
  "name": "The bueyer tries to log in",
  "keyword": "When ",
  "line": 19
});
formatter.step({
  "name": "He is successfully login",
  "keyword": "Then ",
  "line": 20
});
formatter.match({
  "location": "ProgramTestSteps.The_bueyer_goes_to_the_ws()"
});
formatter.result({
  "duration": 9090218602,
  "status": "passed"
});
formatter.match({
  "location": "ProgramTestSteps.The_bueyer_tries_to_log_in()"
});
formatter.result({
  "duration": 3665995499,
  "status": "passed"
});
formatter.match({
  "location": "ProgramTestSteps.He_is_successfully_login()"
});
formatter.result({
  "duration": 1195408905,
  "status": "passed"
});
});