# Eureka Server

This is a server for registration and discovery of `services` in the [microservice](https://microservices.io/) architecture.

## Running Eureka locally
* Eureka is a [Spring Boot](https://spring.io/guides/gs/spring-boot) application built using [Maven](https://spring.io/guides/gs/maven/). 
* You can build a jar file and run it from the command line:

```
./mvnw package
java -jar target/*.jar
```

You can then access `eureka` here: http://localhost:8761/

<img width="1042" alt="eureka-server" src="https://user-images.githubusercontent.com/47880944/101527785-804c4f00-399f-11eb-9df2-937584a3d3e0.png">

Or you can run it from Maven directly using the Spring Boot Maven plugin. If you do this it will pick up changes that you make in the project immediately (changes to Java source files require a compile as well - most people use an IDE for this):

```
./mvnw spring-boot:run
```


### Service Registration
* The project has 3 `services` and you should ensure that all are registered in the server before moving forward.

<img width="1042" alt="services-registered" src="https://user-images.githubusercontent.com/47880944/114758242-69f73b00-9d65-11eb-831e-32d417d90389.png">
