package com.Kushagra.app.service;

import com.Kushagra.app.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    public void addLaptop(Laptop lap) {
        System.out.println("Got a Laptop");
    }

    public boolean isGoodForProg(){
        return true;
    }
}
