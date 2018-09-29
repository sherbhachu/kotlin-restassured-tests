# kotlin-restassured-tests

## Known limitations...

1. No specific gradle task to kill wire mock
2. Probably others... :D

## Want more?

Drop me an email, sherbhachu@googlemail.com for any comments, suggestions, etc.

## Instructions/Config required prior to use...

After cloning this repo...

### Wiremock...

1. cd into ```this/projects/directory/kotlin-restassured-tests/wiremock```
2. Start wiremock... ```java -jar wiremock-standalone-2.19.0.jar --port 8888```

OR...

Start wiremock via gradle ```./gradlew startMockServer```

Check server is up...

Visit this URL in your browser ```http://localhost:8888/greeting```

### Run the tests...

In your IDE of choice (I use IntelliJ CE, go into src/test/java and run the test(s).

OR... 

Run the tests via gradle ```./gradlew test```

### Reports...

Reports can be found in ```kotlin-restassured-tests/build/reports/tests/test/classes/SomeTestClass.html```

## Other/References...

1. https://www.baeldung.com/rest-assured-tutorial
2. http://wiremock.org/docs/running-standalone/
3. https://github.com/rest-assured/rest-assured/wiki/Usage#examples
4. Numerous SO links :D