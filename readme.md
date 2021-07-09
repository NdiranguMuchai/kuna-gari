# Kuna Gari

* This project represents the backend system of a  custom car website. It provides information on make and model of a car, its price and location.

## Prerequisites
The following  should be installed in your system:
* [Java 8 or newer](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Git command line tool](https://help.github.com/articles/set-up-git)
* Your preferred IDE
    * Eclipse with the m2e plugin. Note: when m2e is available, there is an m2 icon in `Help -> About` dialog. If m2e is
      not there, just follow the install process here: https://www.eclipse.org/m2e/
    * [Spring Tools Suite](https://spring.io/tools) (STS)
    * IntelliJ IDEA
    * [VS Code](https://code.visualstudio.com)


## Breakdown
This project follows a `Microservice Architecture` where the modules are structured as `Services` and registered on a `Eureka Server`.

Each individual module is a [Spring Boot](https://spring.io/guides/gs/spring-boot) application built using [Maven](https://spring.io/guides/gs/maven/).

The modules in the project include:
* `Eureka Server` which handles registration of the services.
* `Car Service` which handles all "CRUD" operations on the car object
* `Price Service` which handles the prices of the cars
* `Maps Service` which provides the geographical location of each car.

## Database configuration
No configuration is required since all modules are resting on an in-memory `H2` database.
