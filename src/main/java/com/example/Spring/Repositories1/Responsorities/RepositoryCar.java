package com.example.Spring.Repositories1.Responsorities;

import com.example.Spring.Repositories1.Entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestResource
public interface RepositoryCar extends JpaRepository<Car, Long> {

}
