package com.ndirangu.carservice.service;

import com.ndirangu.carservice.model.Car;

import java.util.List;

public interface CarService {
    List<Car> list();
    Car findById(Long id);
    Car save(Car car);
    void delete(Long id);
}
