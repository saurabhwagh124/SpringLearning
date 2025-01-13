package com.example.SpringBootFirst.repository;

import com.example.SpringBootFirst.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop lap){
        System.out.println("Laptop Saved");
    }
}
