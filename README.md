# Gauge Missing SuiteHookMessages Demo
This repository exists only to demonstrate the missing beforeSuiteHookMessages and afterSuiteHookMessages in the
json-report result.json  while **parallel** Gauge test executions

Please run the tests in specs/example.spec. Without parallel test execution you will find in report/json-report/result.json following SuiteHookMessages: 

````
"beforeSuiteHookFailure": null,
"beforeSuiteHookMessages": [
"Message from @BeforeSuite"
],
"afterSuiteHookFailure": null,
"afterSuiteHookMessages": [
"Message from @AfterSuite"
],
````

If parallel execution is enabled, these messages are missing in the report.
