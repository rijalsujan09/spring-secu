package com.security.demo.anotation.config;

import com.security.demo.anotation.controller.PizzaController;
import com.security.demo.anotation.service.Pizza;
import com.security.demo.anotation.service.impl.NonVegPizza;
import com.security.demo.anotation.service.impl.VegPizza;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="veg")
    public Pizza vegPizza(){
        return  new VegPizza();
    }

    @Bean(name="nonVeg")
    public Pizza nonVegPizza(){
        return  new NonVegPizza();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public PizzaController pizzaController(){
        return  new PizzaController(vegPizza());
    }

//    @Bean(name ="nonVegCon")
//    public PizzaController pizzaController(){
//        return  new PizzaController(nonVegPizza());
//    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
