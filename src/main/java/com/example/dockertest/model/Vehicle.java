package com.example.dockertest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    public Long id;

    public String name;
}
