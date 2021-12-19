package com.codegym.scrum.service;

import com.codegym.scrum.model.Car;
import com.codegym.scrum.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImp implements ICarService{
    @Autowired
    CarRepository carRepository;
    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public Page<Car> findAll(Pageable pageable) {
        return carRepository.findAll(pageable);
    }

    @Override
    public Car findById(Long id) {
        return carRepository.findById(id).get();
    }

    @Override
    public void save(Car car) {
    }

}
