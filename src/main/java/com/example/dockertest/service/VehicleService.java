package com.example.dockertest.service;

import com.example.dockertest.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public Vehicle findById(Long id ){

        return vehicleRepository.findById( id ).get();
    }

    public Vehicle save() {

        Vehicle vehicle = new Vehicle();
        vehicle.name = UUID.randomUUID().toString();

        return vehicleRepository.save( vehicle );
    }
}
