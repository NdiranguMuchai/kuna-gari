# Maps Service

This represents a Maps WebService where, given a latitude
longitude, it will return a random address.

## Running Maps Service
Via shell, it can be started using

```
$ mvn clean package
```

```
$ java -jar target/maps-service-0.0.1-SNAPSHOT.jar
```

The service is available by default on port `9191`. You can check it on the
command line by using

```
$ curl http://localhost:9191/maps\?lat\=20.0\&lon\=30.0
``` 

You can also import it as a Maven project on your preferred IDE and
run the class `MapsServiceApplication`.
