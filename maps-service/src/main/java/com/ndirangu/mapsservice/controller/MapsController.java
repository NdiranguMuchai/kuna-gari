package com.ndirangu.mapsservice.controller;

import com.ndirangu.mapsservice.model.Address;
import com.ndirangu.mapsservice.repository.AddressRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/maps")
public class MapsController {

    @GetMapping
    public Address get(@RequestParam Double lat, @RequestParam Double lon) {
        return AddressRepository.getRandom();
    }
}
