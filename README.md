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
![allurereport](https://user-images.githubusercontent.com/84721020/133981163-f14c1e5d-bf44-407d-a282-42584c7775f4.jpg)
