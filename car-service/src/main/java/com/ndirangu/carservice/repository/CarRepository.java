package com.ndirangu.carservice.repository;

import com.ndirangu.carservice.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
