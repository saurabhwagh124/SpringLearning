package com.example.SpringBootFirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    @Autowired
    Cpu cpu;
    public void compile(){
        System.out.println("Compiling ...");
        cpu.processing();
    }
}
