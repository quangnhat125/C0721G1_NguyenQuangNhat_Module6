package com.codegym.scrum.controller;

import com.codegym.scrum.model.Car;
import com.codegym.scrum.model.Destination;
import com.codegym.scrum.service.ICarService;
import com.codegym.scrum.service.IDestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/car")
@CrossOrigin
public class CarController {
    @Autowired
    ICarService carService;
    @Autowired
    IDestinationService destinationService;

//    @ModelAttribute("destinationList")
//    public List<Destination> showListDestination() {
//        return destinationService.findAll();
//    }

    @GetMapping("")
    public ResponseEntity<?> getList() {
        List<Car> carList = carService.findAll();
        if (carList.size() == 0) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(carList, HttpStatus.OK);
    };
    @GetMapping("findById/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long id){
        Car car = carService.findById(id);
        return new ResponseEntity<>(car, HttpStatus.OK);
    }
    @PatchMapping("/update")
    public ResponseEntity<?> updateProduct(@RequestBody Car car){
        carService.save(car);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}