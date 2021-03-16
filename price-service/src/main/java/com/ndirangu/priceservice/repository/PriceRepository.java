package com.ndirangu.priceservice.repository;

import com.ndirangu.priceservice.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, Long> {
}
