package com.codegym.scrum.service;

import com.codegym.scrum.model.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICarService {
    List<Car> findAll();
    Page<Car> findAll(Pageable pageable);
    Car findById(Long id);

    void save(Car car);
}
