package com.ndirangu.carservice.service;

import com.ndirangu.carservice.client.maps.MapsClient;
import com.ndirangu.carservice.client.prices.PriceClient;
import com.ndirangu.carservice.exception.CarNotFoundException;
import com.ndirangu.carservice.model.Car;
import com.ndirangu.carservice.model.Location;
import com.ndirangu.carservice.repository.CarRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    private final CarRepository repository;
    private final WebClient webClientMaps;
    private final WebClient webClientPricing;
    private final PriceClient priceClient;
    private final MapsClient mapsClient;

    public CarServiceImpl(CarRepository repository,
                          @Qualifier("maps") WebClient webClientMaps,
                          @Qualifier("pricing") WebClient webClientPricing,
                          PriceClient priceClient,
                          MapsClient mapsClient) {

        this.repository = repository;
        this.webClientMaps = webClientMaps;
        this.webClientPricing = webClientPricing;
        this.priceClient = priceClient;
        this.mapsClient = mapsClient;
    }


    public List<Car> list() {
        return repository.findAll();
    }


    public Car findById(Long id) {
        Car car = repository.findById(id).orElseThrow(()-> new CarNotFoundException("Car with id "+id+" not found"));

        car.setPrice(priceClient.getPrice(id));

        Double lat = Math.random();
        Double lon = Math.random();
        Location location = new Location(lat, lon);

        car.setLocation(mapsClient.getAddress(location));

        return car;
    }

    public Car save(Car car) {
        if (car.getId() != null) {
            return repository.findById(car.getId())
                    .map(carToBeUpdated -> {
                        carToBeUpdated.setDetails(car.getDetails());
                        carToBeUpdated.setLocation(car.getLocation());
                        carToBeUpdated.setCondition(car.getCondition());
                        return repository.save(carToBeUpdated);
                    }).orElseThrow(CarNotFoundException::new);
        }

        return repository.save(car);
    }


    public void delete(Long id) {
        repository.findById(id).orElseThrow(()-> new CarNotFoundException("Car with id "+id+" not found"));

        repository.deleteById(id);

    }
}
