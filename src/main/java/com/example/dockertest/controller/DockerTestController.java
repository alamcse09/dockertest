package com.example.dockertest.controller;

import com.example.dockertest.model.Vehicle;
import com.example.dockertest.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerTestController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping( "/docker" )
    public String test(){

        return "Hello world";
    }

    @GetMapping( "/add" )
    public Vehicle add(){

        return vehicleService.save();
    }

    @GetMapping( "/{id}" )
    public Vehicle get(@PathVariable("id") Long id ){

        return vehicleService.findById( id );
    }
}
