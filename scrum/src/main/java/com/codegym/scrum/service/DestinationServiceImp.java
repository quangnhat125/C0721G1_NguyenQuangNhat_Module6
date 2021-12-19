package com.codegym.scrum.service;

import com.codegym.scrum.model.Destination;
import com.codegym.scrum.repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DestinationServiceImp implements IDestinationService{
    @Autowired
    DestinationRepository destinationRepository;
    @Override
    public List<Destination> findAll() {
        return destinationRepository.findAll();
    }
}
