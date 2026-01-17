package com.Kushagra.app.repo;

import com.Kushagra.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("lap saved in DB");
    }
}
