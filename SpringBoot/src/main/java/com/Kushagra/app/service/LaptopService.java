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


//We have a (1)Client -> (2)Server -> (3)DataBase | We have 03 Layer in the Server (1)Controller (2)Service (3)Repository
//
