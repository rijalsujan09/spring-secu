package com.security.demo.anotation.service.impl;

import com.security.demo.anotation.service.Pizza;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class VegPizza  implements Pizza {

    @Override
    public String getPizza(){
        return  "this is veg Pizza";
    }
}
