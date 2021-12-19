package com.codegym.scrum.model;

import javax.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String carPlate;
    private String name;
    private String type;
    @ManyToOne
    @JoinColumn(name = "departure", referencedColumnName = "id")
    private Destination departure;
    @ManyToOne
    @JoinColumn(name = "arrival", referencedColumnName = "id")
    private Destination arrival;
    private String phone;
    private String email;


    public Car() {
    }


    public Car(Long id, String carPlate, String name, String type, Destination departure, Destination arrival, String phone, String email) {
        this.id = id;
        this.carPlate = carPlate;
        this.name = name;
        this.type = type;
        this.departure = departure;
        this.arrival = arrival;
        this.phone = phone;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Destination getDeparture() {
        return departure;
    }

    public void setDeparture(Destination departure) {
        this.departure = departure;
    }

    public Destination getArrival() {
        return arrival;
    }

    public void setArrival(Destination arrival) {
        this.arrival = arrival;
    }
}
