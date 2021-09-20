## Autotests for renins.ru

You can run test without properties
```
gradle clean tests
```
tests run with default properties (browser Chrome, browserSize 1920x1080)

or you can run test with properties
```
gradle clean test
-Dbrowser=
-DbrowserSize=
```
Also you can add properties file to src/test/resources/config/local.properties
```
browser=chrome
browserSize=1920x1080
```

Allure report
```
allure serve build/allure-results
```
