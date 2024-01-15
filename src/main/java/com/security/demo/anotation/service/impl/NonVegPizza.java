package com.security.demo.anotation.service.impl;

import com.security.demo.anotation.service.Pizza;
import org.springframework.stereotype.Component;

//@Component
public class NonVegPizza implements Pizza {
    @Override
    public String getPizza() {
        return "this is Non Veg Pizza";
    }


}
