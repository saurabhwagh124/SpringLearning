package com.example.SpringBootFirst.service;

import com.example.SpringBootFirst.Laptop;
import com.example.SpringBootFirst.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap){
        repo.save(lap);
        System.out.println("Laptop added");
    }

    public Boolean isGoodForProg(Laptop lap){
        return true;
    }
}
