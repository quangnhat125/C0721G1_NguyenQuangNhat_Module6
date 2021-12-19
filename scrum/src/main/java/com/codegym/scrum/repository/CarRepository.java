package com.codegym.scrum.repository;

import com.codegym.scrum.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
