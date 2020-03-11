# TrebolIT fm integration tests

TrebolIT fm project is developed by TrebolIT

## Getting Started

Use mvnw/mvnw.cmd for running Maven.

All tests are configured for running on http://fm.trebolit.com.ar:8080/fm. 
You must change your etc/hosts . Eg:
````
127.0.0.1 fm.trebolit.com.ar
````
_Test report source location : fm-integration-test/src/test/scala_

_Test report output location : fm-integration-test/target/gatling_

### Creating new tests:

For recording new scenarios execute gatling:recorder goal. Eg:
````
mvnw gatling:recorder
````

### Running tests:

For running one scenario execute gatling:test goal. Eg:
````
mvnw gatling:test -Dgatling.simulationClass=com.asofarma.fm.v2018.ClientsProfesionals
````

For running all scenarios execute gatling:test goal. Eg:
````
mvnw gatling:test
````

_Visit https://gatling.io/docs/current/http/recorder for more information about recorder_

_Visit Gatling documentation site for more information: https://gatling.io/docs/current_
 
