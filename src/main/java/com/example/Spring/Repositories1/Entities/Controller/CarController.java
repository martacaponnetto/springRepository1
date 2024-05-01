package com.example.Spring.Repositories1.Entities.Controller;

import com.example.Spring.Repositories1.Entities.Car;
import com.example.Spring.Repositories1.Responsorities.RepositoryCar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class CarController {
    private final RepositoryCar repositoryCar;

    public CarController(RepositoryCar repositoryCar) {
        this.repositoryCar = repositoryCar;
    }
    @GetMapping("/cars")
    public List<Car> getAllCars() {
        return repositoryCar.findAll();

    }
}

