package com.codegym.scrum.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Destination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "departure")
    @JsonBackReference(value = "backclass")
    private List<Car> carList;
    @OneToMany(mappedBy = "arrival")
    @JsonBackReference(value = "backclass")
    private List<Car> carsList;

    public Destination(Long id, String name, List<Car> carList, List<Car> carsList) {
        this.id = id;
        this.name = name;
        this.carList = carList;
        this.carsList = carsList;
    }

    public Destination() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> getCarsList() {
        return carsList;
    }

    public void setCarsList(List<Car> carsList) {
        this.carsList = carsList;
    }
}
