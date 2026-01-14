package com.Kushagra.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human {

    @Autowired
    laptop lap;

    public void code(){
//        System.out.println("Coding");

        lap.compile();
    }
}
