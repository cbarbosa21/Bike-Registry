package com.globomatics.bike.controllers;

import com.globomatics.bike.models.Bike;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {

    // List Bikes
    @GetMapping()
    public List<Bike> list() {
        List<Bike> bikes = new ArrayList<>();
        return bikes;
    }

    // Create bike
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Bike bike) {

    }

    // View specific bike based on id.
    @GetMapping("/{id}")
    public Bike get(@PathVariable("id") long id) {
        return new Bike();
    }

}
