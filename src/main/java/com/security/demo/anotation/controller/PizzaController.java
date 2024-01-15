package com.security.demo.anotation.controller;

import com.security.demo.anotation.service.Pizza;

//@Component
public class PizzaController {


    private Pizza pizza;

//    @Autowired
//    public PizzaController (@Qualifier(value = "nonVegPizza") Pizza pizza){
//     this.pizza=pizza;
//    }
//@Autowired
public PizzaController (Pizza pizza){
    this.pizza=pizza;
}

//    @Autowired
//    public void setVegPizza(VegPizza vegPizza){
//        this.vegPizza = vegPizza;
//    }

    public String getPizza(){
        return this.pizza.getPizza();
    }

    public void init(){
        System.out.println("Initialization logic");
    }

    public void destroy(){
        System.out.println("Destruction logic");
        return ;
    }
}
