package com.ndirangu.carservice.controller;

import com.ndirangu.carservice.model.Car;
import com.ndirangu.carservice.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    List<Car> list(){
        return carService.list();
    }

    @GetMapping("/{id}")
    Car get(@PathVariable Long id){
        return carService.findById(id);
    }

    @PostMapping
    Car save(@RequestBody Car car){
        return carService.save(car);
    }

    @PutMapping("/{id}")
    Car update(@PathVariable Long id, @RequestBody Car car){
        car.setId(id);
        return carService.save(car);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id){
        carService.delete(id);
    }

}
