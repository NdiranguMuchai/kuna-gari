# Car Service
This is the main `service` in the Architecture.

It provides all details about a vehicle that is on sale, including its price and where its precise location.


### Service Interaction
The application collects information  from the `Pricing Service` as well as from `Maps Service` by leveraging Spring's `Web Client` and `Model Mapper` libraries.

### Running Car Service 
Via shell, it can be started using

```
$ mvn clean package
```

```
$ java -jar target/car-service-0.0.1-SNAPSHOT.jar
```

The service is available by default on port `8088`. You can check it on the
command line by using

```
$ curl http://localhost:8088/cars
``` 

You can also import it as a Maven project on your preferred IDE and
run the class `CarServiceApplication`.

