# Price Service

This represents a Pricing WebService where the prices of the cars in the system are calculated.

## Running Price Service
Via shell, it can be started using

```
$ mvn clean package
```

```
$ java -jar target/price-service-0.0.1-SNAPSHOT.jar
```

The service is available by default on port `8082`. You can check it on the
command line by using

```
$ curl http://localhost:8082/services/price
``` 

You can also import it as a Maven project on your preferred IDE and
run the class `PriceServiceApplication`.
