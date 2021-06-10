## Assessment (Kotlin/Java Technical Test)

* Bootstrap a Springboot API project
* Provide clear instructions in README for how we can run the project. Ideally you'd provide a Dockerfile so that we can run it for ourselves easily
* Use whatever frameworks or libraries that you are comfortable with
* Create an API endpoint that runs the Fizz Buzz(1) test on the backend, and return the result back to the API consumer as an array of integers
* Allow the API consumer to provide a number as a parameter to the API, which acts as the upper limit for the Fizz Buzz test
* When the consumer submits the number to the server, provide the Fizz Buzz sequence
* Include 2 automated tests to prove that the above requirements run successfully, and in the README explain what other tests you might consider
* Give consideration to how you would provide authentication, and if you have time implement an authentication mechanism. If not, provide some thoughts in the README of how you might have implemented auth
* Provide the source code of the project to me as a public Github repository
* Any other architectural, code pattern, style, or design considerations are entirely up to you

(1). Fizz Buzz as per: https://en.wikipedia.org/wiki/Fizz_buzz 


## Run as docker container
```shell
$ docker build . -t fizzbuzz:1.0.0
$ docker run -d -p8080:8080 --name fizzbuzz fizzbuzz:1.0.0 
```

## Test from console
```shell
$ curl -H "Authorization: Basic dXNlcjpmaXp6YnV6eg==" -X GET http://localhost:8080/api/v1/fizzbuzz/9
```

## Authentication considerations
In this assessment Basic Authentication was used (username/password Base64 encoded). Of course this is not a secure method for clear text communication so at least SSL should be added to encrypt communication. 
At the moment `password` is also set in clear text on the `application.properties` file and will end up in the source code control system, this is of course unacceptable. Solution would be to use environment variables injected at runtime, whose values are retrieved from a Secret Management service.
Better would be to use other methods involving token exchange (e.g. JWT) and industry standard Authorization Server (e.g. OAuth2 implementation).


## Who do I talk to?
* michele.scapin@gmail.com
