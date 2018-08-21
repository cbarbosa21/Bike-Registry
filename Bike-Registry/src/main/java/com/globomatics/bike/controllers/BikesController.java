package com.globomatics.bike.controllers;

import com.globomatics.bike.models.Bike;
import com.globomatics.bike.repositories.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {

    private BikeRepository bikeRepository;

    @Autowired
    public BikesController(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    // List Bikes
    @GetMapping()
    public List<Bike> list() {
        return bikeRepository.findAll();
    }

    // Create bike
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Bike bike) {
        bikeRepository.save(bike);
    }

    // View specific bike based on id.
    @GetMapping("/{id}")
    public Bike get(@PathVariable("id") long id) {
        return bikeRepository.getOne(id);
    }

}
